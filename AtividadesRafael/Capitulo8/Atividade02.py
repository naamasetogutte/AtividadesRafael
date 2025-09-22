def quadrado(num):
    return num * num

def fatorial(num):
    resultado = 1
    for i in range(1, num + 1):
        resultado *= i
    return resultado

while True:
    print("escolha uma opção:")
    print("1. calcular quadrado")
    print("2. calcular fatorial")
    print("3. sair")
    escolha = int(input("digite sua escolha: "))

    if escolha == 1 or escolha == 2:
        num = int(input("digite um número: "))
    
    if escolha == 1:
        print(f"quadrado de {num}: {quadrado(num)}")
    elif escolha == 2:
        print(f"fatorial de {num}: {fatorial(num)}")
    elif escolha == 3:
        print("saindo...")
        break
    else:
        print("opção inválida! tente novamente.")

//comparacoes entre as implementações:

python com if/elif/else: o python, com suas estruturas if/elif/else, proporciona uma solução mais simples
e compacta, especialmente para menus com poucas opções. a sintaxe de python também é mais legível e rápida
de escrever.