(ns avaliacao-estudantes)

(def msg-otimo "Turma excelente!")
(def msg-regular "Bom desempenho!")
(def msg-atencao "É necessário melhorar!")

(defn calcular-classificacao [valor]
  (cond
    (>= valor 90) "A"
    (>= valor 80) "B"
    (>= valor 70) "C"
    (>= valor 60) "D"
    :else "F"))

(defn analisar-resultado [resultado]
  (if (>= resultado 80)
    msg-otimo
    (if (>= resultado 60)
      msg-regular
      msg-atencao)))

(defn validar-nota [nota]
  (and (>= nota 0) (<= nota 100)))

(defn formatar-media [valor]
  (format "%.1f" (double valor)))

(defn iniciar []
  (println "Quantos alunos na turma?")
  (let [total-estudantes (Integer/parseInt (read-line))]
    (loop [atual 1
           total-pontos 0
           total-passou 0]
      (if (<= atual total-estudantes)
        (do
          (println (str "\nNome do aluno " atual ":"))
          (let [estudante (read-line)
                _ (println "Nota:")
                nota-str (read-line)
                nota (Integer/parseInt nota-str)]
            (if (validar-nota nota)
              (let [resultado (calcular-classificacao nota)]
                (println (str estudante " - Conceito: " resultado))
                (recur (inc atual)
                      (+ total-pontos nota)
                      (if (>= nota 60)
                        (inc total-passou)
                        total-passou)))
              (do
                (println "Nota inválida! A nota deve estar entre 0 e 100.")
                (recur atual total-pontos total-passou)))))
        (let [media-final (/ total-pontos total-estudantes)]
          (println (str "\nMédia da turma: " (formatar-media media-final)))
          (println (str "Aprovados: " total-passou))
          (println (str "Desempenho geral: " (analisar-resultado media-final))))))))

(iniciar)