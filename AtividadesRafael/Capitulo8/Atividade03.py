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
        num = int(input("digite um numero: "))
    
    if escolha == 1:
        print(f"quadrado de {num}: {quadrado(num)}")
    elif escolha == 2:
        print(f"fatorial de {num}: {fatorial(num)}")
    elif escolha == 3:
        print("saindo...")
        break
    else:
        print("opcao invalida! tente novamente.")


//explorando alternativas ao goto

def processar_numeros(lista):
    for num in lista:
        if num == 0:
            print("numero 0 encontrado, saindo...")
            break
        elif num < 0:
            continue
        elif num % 2 == 0:
            print(f"primeiro numero par encontrado: {num * 2}")
            return num * 2 

numeros = [5, -2, 3, 0, 8]
processar_numeros(numeros)


//pseudocodigo

iniciar:
    ler num
    if num == 0 then goto sair
    if num < 0 then goto continuar
    if num % 2 == 0 then goto retornar

continuar:
    continue para o proximo numero
    goto iniciar

retornar:
    retornar num * 2
    goto sair

sair:
    fim
