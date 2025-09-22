x = 10

def f():
    print("Valor de x em f():", x)

def g():
    x = 20 
    f()  

g()
