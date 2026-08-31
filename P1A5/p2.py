class Empleado:

    def __init__(self, nombre, apellidoPaterno, salarioMensual):
        self.nombre = nombre
        self.apellidoPaterno = apellidoPaterno

        if salarioMensual > 0:
            self.salarioMensual = salarioMensual
        else:
            self.salarioMensual = 0.0

    def obtenerSalarioAnual(self):
        return self.salarioMensual * 12


print("Datos del Empleado 1")
nombre = input("Nombre: ")
apellido = input("Apellido paterno: ")
salario = float(input("Salario mensual: "))

emp1 = Empleado(nombre, apellido, salario)

print("\nDatos del Empleado 2")
nombre = input("Nombre: ")
apellido = input("Apellido paterno: ")
salario = float(input("Salario mensual: "))

emp2 = Empleado(nombre, apellido, salario)

print("\nSalarios anuales antes del aumento:")
print(emp1.nombre, emp1.apellidoPaterno, ": $", emp1.obtenerSalarioAnual())
print(emp2.nombre, emp2.apellidoPaterno, ": $", emp2.obtenerSalarioAnual())

emp1.salarioMensual *= 1.10
emp2.salarioMensual *= 1.10

print("\nSalarios anuales despues del aumento del 10%:")
print(emp1.nombre, emp1.apellidoPaterno, ": $", emp1.obtenerSalarioAnual())
print(emp2.nombre, emp2.apellidoPaterno, ": $", emp2.obtenerSalarioAnual())