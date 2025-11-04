(ns integrador.core
  (:gen-class))

(defn ler-float [prompt]
  (println prompt)
  (try
    (Float/parseFloat (read-line))
    (catch Exception _ 0.0)))

(defn cadastrar-alunos []
  (loop [alunos []]
    (println "Digite o nome do aluno (ou deixe em branco para sair):")
    (let [nome (read-line)]
      (if (clojure.string/blank? nome)
        alunos
        (let [nota (ler-float "Digite a nota do aluno:")
              aluno {:nome nome :nota nota}]
          (recur (conj alunos aluno)))))))

(defn status [nota]
  (if (>= nota 60.0) "Aprovado" "Reprovado"))

(defn relatorio-notas [alunos]
  (let [alunos-status (map #(assoc % :status (status (:nota %))) alunos)
        aprovados (filter #(= (:status %) "Aprovado") alunos-status)
        reprovados (filter #(= (:status %) "Reprovado") alunos-status)
        media (if (seq alunos)
                (/ (reduce + (map :nota alunos)) (count alunos))
                0.0)]
    (println "\n--- Relatorio de Notas ---")
    (println "Alunos aprovados:")
    (doseq [a aprovados]
      (println (:nome a) "- Nota:" (:nota a) "- Status:" (:status a)))
    (println "\nAlunos reprovados:")
    (doseq [a reprovados]
      (println (:nome a) "- Nota:" (:nota a) "- Status:" (:status a)))
    (println "\nMedia geral da turma:" (format "%.2f" media))))

(defn estatisticas-gerais [alunos]
  (let [alunos-status (map #(assoc % :status (status (:nota %))) alunos)
        total (count alunos)
        aprovados (count (filter #(= (:status %) "Aprovado") alunos-status))
        reprovados (- total aprovados)
        notas (map :nota alunos)
        maior (if (seq notas) (apply max notas) 0.0)
        menor (if (seq notas) (apply min notas) 0.0)
        media (if (seq notas) (/ (reduce + notas) total) 0.0)]
    (println "\n--- Estatisticas Gerais ---")
    (println "Total de alunos:" total)
    (println "Aprovados:" aprovados)
    (println "Reprovados:" reprovados)
    (println "Maior nota:" maior)
    (println "Menor nota:" menor)
    (println "Média geral da turma:" (format "%.2f" media))))

(defn buscar-aluno [alunos]
  (println "Digite o nome do aluno para buscar:")
  (let [nome (read-line)
        aluno (first (filter #(= (:nome %) nome) alunos))]
    (if aluno
      (println "Aluno:" (:nome aluno) "- Nota:" (:nota aluno) "- Status:" (status (:nota aluno)))
      (println "Aluno não encontrado."))))

(defn menu []
  (loop [alunos []]
    (println "\n=== MENU PRINCIPAL ===")
    (println "1 - Cadastrar Alunos")
    (println "2 - Relatorio de Notas")
    (println "3 - Estatisticas Gerais")
    (println "4 - Buscar aluno pelo nome")
    (println "0 - Sair")
    (println "Escolha uma opção:")
    (let [opcao (read-line)]
      (cond
        (= opcao "1") (recur (cadastrar-alunos))
        (= opcao "2") (do (relatorio-notas alunos) (recur alunos))
        (= opcao "3") (do (estatisticas-gerais alunos) (recur alunos))
        (= opcao "4") (do (buscar-aluno alunos) (recur alunos))
        (= opcao "0") (println "Saindo...")
        :else (do (println "Opção invalida!") (recur alunos))))))

(defn -main [& _]
  (menu))
