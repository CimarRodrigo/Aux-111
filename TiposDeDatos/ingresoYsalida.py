# input() <- entrada de datos
# print() <- salida de datos

# Ingreso de datos
nombre = input("Ingrese su nombre: ")
edad = int(input("Ingrese su edad: ")) # convertir el input en entero

# a, b = map(int, input().split())  # .split() separa los datos por espacio

# print(a, b)

# salida de datos
# print(numero) 


# distintos tipos de print

# print("Hola mundo")
# print(20)
# print(20.5)

# concatenar
# print("Numero:", numero, 20, 30.5)

# Formatos de print

# Primera forma
# print("Hola mi nombre es: {}, y tengo {} años".format(nombre, edad))
# print("{}/{}^{}".format(10, 2, 3))

# Segunda forma
print(f"Hola mi nombre es: {nombre}, y tengo {edad} años")
print(f"{10}/{2}^{3}")

# Redondear

a = 10.999999
print("{:.3f}".format(a))


#Rellenar con ceros
print("{:05d}".format(1000))

