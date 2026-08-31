# ChristopherHG

class Factura:

    def __init__(self):
        self.numPieza = ""
        self.descripcion = ""
        self.cantidad = 0
        self.precio = 0.0

    # Método para obtener el monto de la factura
    def obtenerMonFactura(self):
        return self.cantidad * self.precio

ferre = Factura()

ferre.numPieza = input("Numero de pieza: ")
ferre.descripcion = input("Descripcion: ")
ferre.cantidad = int(input("Cantidad: "))
ferre.precio = float(input("Precio: "))

if ferre.precio < 0:
    ferre.precio = 0.0

if ferre.cantidad < 0:
    ferre.cantidad = 0

print("Factura:", ferre.obtenerMonFactura())