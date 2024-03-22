"""
2. Dado un lote de N números y un número k, cuando se encuentre un múltiplo de k mostrar la
suma de la siguiente manera:
N = 15, k = 3
1, 6, 7, 2, 9, 12, 3, 4, 5, 6, 24, 7, 30, 1, 3, 5, 4, 12
   6         21               33         33           12

1er. Problema: Encontrar los multiplos de k
2do. Problema: Encontrar la serie oculta  
3er. Problema: sumar la serie oculta   
"""

n = int(input("Ingrese un n: "))
k = int(input("Ingrese un k: "))

signo = 1
p = 1
m = 1
s = 0
c = 0
for i in range(1, n+1):
    x = int(input("Ingrese un numero: "))
    if x % k == 0: #resolucion del primer problema
        c = c + 1 # controlando las veces que se suma el multiplo de k
        s = s + x # sumando el multiplo de k
         
        if c == m: # controlando si ya se sumaron las veces necesarias en la serie oculta
            print(s)
            s = 0
            c = 0
            m  = m + signo # solucionando el 2do problema y 3er problema
            p = p + 1 # contador de la serie oculta
            if p > 2:
                signo = signo * -1
                p = 1