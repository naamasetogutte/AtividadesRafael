// Por valor
#include <stdio.h>

void dobrar_por_valor(int x) {
    x = x * 2;
}

int main() {
    int num = 10;
    dobrar_por_valor(num);  
    printf("valor de num apos dobrar por valor: %d\n", num); 
    return 0;
}

//Por referencia

void dobrar_por_referencia(int *x) {
    *x = *x * 2;
}

int main() {
    int num = 10;
    dobrar_por_referencia(&num);  
    printf("valor de num apos dobrar por referencia: %d\n", num);  
    return 0;
}

// Programa principal

void dobrar_por_valor(int x) {
    x = x * 2;
}

void dobrar_por_referencia(int *x) {
    *x = *x * 2;
}

int main() {
    int num = 10;

    dobrar_por_valor(num);
    printf("valor de num apos dobrar por valor: %d\n", num);  // num permanece 10

    dobrar_por_referencia(&num);
    printf("valor de num apos dobrar por referencia: %d\n", num);  // num sera 20

    return 0;
}

//Diferença observada entre as versoes:

na versao por valor, a variavel original nao e alterada, pois a funcao recebe uma copia do valor.

na versao por referencia, o valor da variavel original e alterado diretamente, pois a funcao
recebe o endereco da variavel.

//Por que o valor da variavel so se altera na versao por referencia?

na versao por valor, a funcao trabalha apenas com uma copia do valor da variavel, e qualquer
alteracao feita dentro da funcao nao afeta a variavel original.

na versao por referencia, como passamos o endereco da variavel, qualquer modificacao feita dentro
da funcao reflete diretamente na variavel original.

// Relaçao com as estrategias de passagem de parametros:

a passagem por valor e comum em muitas linguagens e implica que a funcao recebe uma copia do valor,
sem afetar o original.

a passagem por referencia, geralmente usando ponteiros ou referencias, permite que a funcao altere o
valor original da variavel.