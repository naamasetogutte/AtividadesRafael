#include <stdio.h>

int quadrado(int num) {
    return num * num;
}

int fatorial(int num) {
    int resultado = 1;
    for (int i = 1; i <= num; i++) {
        resultado *= i;
    }
    return resultado;
}

int main() {
    int escolha, num;
    
    do {
        printf("escolha uma opcao:\n");
        printf("1. calcular quadrado\n");
        printf("2. calcular fatorial\n");
        printf("3. sair\n");
        printf("digite sua escolha: ");
        scanf("%d", &escolha);

        if (escolha == 1 || escolha == 2) {
            printf("digite um numero: ");
            scanf("%d", &num);
        }

        switch (escolha) {
            case 1:
                printf("quadrado de %d: %d\n", num, quadrado(num));
                break;
            case 2:
                printf("fatorial de %d: %d\n", num, fatorial(num));
                break;
            case 3:
                printf("saindo\n");
                break;
            default:
                printf("opcao invalida! tente novamente.\n");
        }
    } while (escolha != 3);
    
    return 0;
}


//comparação entre as implementações:

c com switch/case: a solução em c é mais estruturada e pode ser mais eficiente,
mas exige o uso de um switch para cada opção. o switch é bastante claro quando se tem várias opções,
mas o código fica maior.
