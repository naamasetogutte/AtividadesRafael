package main

import (
    "fmt"
    "time"
)

func escrever(texto string) {
    for i := 0; i < 5; i++ {
        fmt.Println(texto, i)
        time.Sleep(time.Millisecond * 500)
    }
}

func main() {
    go escrever("corrotina")  
    escrever("funcao normal")
}

//o que acontece com a ordem das mensagens exibidas?

a ordem das mensagens pode variar a cada execução, pois a corrotina e a funcao principal estão sendo executadas
concorrentemente. O programa nao tem controle exato sobre a ordem de execucao das funcoes.

//por que as mensagens da corrotina e da funcao normal se intercalam?

isso acontece porque a corrotina e a funcao normal estão sendo executadas em paralelo. as duas estão sendo
executadas de forma concorrente, e o processador alterna entre elas, o que causa a intercalagem das mensagens.

//relacao com a definicao de corrotinas:

as corrotinas permitem a execucao de tarefas em paralelo sem bloquear o fluxo principal do programa.
em go, a palavra-chave go facilita a criacao de corrotinas para tarefas que podem ser executadas de
forma assíncrona.