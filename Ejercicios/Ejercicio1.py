"""
Dado un número n y un número k voltear los números dentro del rango de k a k
Ejemplo:
N = 65318764919, k = 1
Salida : 65319467819

1er. Problema: Componer los numeros de vuelta
2do. Problema: Encontrar los numeros en el rango
3er. Problema: Voltear los numeros en el rango

"""
import math


n = int(input("Ingrese un n: "))
k = int(input("Ingrese un k: "))

cd = int(math.log10(n)) + 1

componer_volteado = 0
contador_digitos_volteados = 0
componer = 0


sw = 0 # 0 numero encontrado y volteando
while cd > 0:
    d = n // 10 ** (cd - 1) # sacando el primer digito
    n = n % 10 ** (cd - 1) # sacando el resto de digitos
    cd = cd - 1 #  disminuyendo el contador de digitos
    if d == k:
        if sw == 0: # apertura
            sw = 1 # ya encontramos el digito k
        else: # clausura
            sw = 0 # ya encontramos el digito k
            aux = 0 #para voltear el numero
            while componer_volteado > 0:                    # Voltear el numero que encontramos          
                x = componer_volteado % 10                  
                componer_volteado = componer_volteado // 10 
                aux = aux * 10 + x                          
                
            componer = componer * (10**contador_digitos_volteados) + aux
            
            contador_digitos_volteados = 0
            componer_volteado = 0
        componer = componer * 10 + d #componer el k de vuelta
        continue # continue omitir el resto del codigo en la iteracion actual

    if (sw == 1):
        contador_digitos_volteados = contador_digitos_volteados + 1
        componer_volteado = componer_volteado * 10 + d
    else:
        componer = componer * 10 + d

# fin del ciclo while -------------------------------------------------------------

if contador_digitos_volteados > 0: # contador > 0 nos indica que nunca hubo clausura
    componer = componer*(10**contador_digitos_volteados) + componer_volteado # componer si no hubo clausura
print(componer)



