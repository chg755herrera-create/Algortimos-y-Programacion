class Fecha:

    def __init__(self, mes, dia, anio):
        self.mes = mes
        self.dia = dia
        self.anio = anio

    def mostrarFecha(self):
        print(self.mes, "/", self.dia, "/", self.anio, sep="")


fecha1 = Fecha(8, 30, 2026)
fecha2 = Fecha(12, 25, 2026)

print("Fecha 1:")
fecha1.mostrarFecha()

print("Fecha 2:")
fecha2.mostrarFecha()