#include <stdio.h>

struct Livro {
    char titulo[50];
    char autor[50];
    int anoPublicacao;
};

int main() {
    int numeros[5] = {1, 2, 3, 4, 5};
    
    struct Livro livro1 = {"titulo", "autor", 2005};
    
    printf("Título do livro: %s\n", livro1.titulo);
    return 0;
}
