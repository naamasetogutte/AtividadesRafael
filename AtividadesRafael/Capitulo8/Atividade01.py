i = 1
while i <= 10:
    print(i)
    i += 1


for i in range(1, 11):
    print(i)


//Comparação dos três códigos:

código com goto (original): a utilização de goto torna o código menos legível e mais difícil de manter,
pois os saltos entre seções do código podem ser imprevisíveis.

código com while: mais legível, pois a condição de repetição está explícita no início. no entanto,
pode ser mais suscetível a erros se a condição não for bem definida.

código com for: a forma mais compacta e legível, especialmente quando se sabe o número exato de repetições.
o laço for já cuida da inicialização e do incremento de i.

conclusão: o código usando for é o mais legível e direto, pois lida com o contador de forma automática e clara.
o while é igualmente útil, mas o for facilita a compreensão do fluxo de controle.
