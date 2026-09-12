class PedidoPizza:

    def __init__(self, tamanio="", ingredientes=0, descripcion=""):
        self.tamanio = tamanio
        self.ingredientes = ingredientes
        self.descripcion = descripcion
        self.precioBase = 0.0

        if tamanio.lower() == "chica":
            self.precioBase = 80.0
        elif tamanio.lower() == "mediana":
            self.precioBase = 100.0
        elif tamanio.lower() == "grande":
            self.precioBase = 120.0

    def getTamanio(self):
        return self.tamanio

    def setTamanio(self, tamanio):
        self.tamanio = tamanio

        if tamanio.lower() == "chica":
            self.precioBase = 80.0
        elif tamanio.lower() == "mediana":
            self.precioBase = 100.0
        elif tamanio.lower() == "grande":
            self.precioBase = 120.0

    def getIngredientes(self):
        return self.ingredientes

    def setIngredientes(self, ingredientes):
        self.ingredientes = ingredientes

    def getDescripcion(self):
        return self.descripcion

    def setDescripcion(self, descripcion):
        self.descripcion = descripcion

    def calcularTotal(self):
        return self.precioBase + self.ingredientes * 15

    def generarResumenPedido(self):
        print("\n--- TICKET DE COMPRA ---")
        print("Pizza:", self.getTamanio())
        print("Descripción:", self.getDescripcion())
        print("Ingredientes extra:", self.getIngredientes())
        print("Precio total: $", self.calcularTotal())
        print("Gracias por su compra")


def main():

    pedido1 = PedidoPizza()

    tamanio = input("Ingrese el tamaño de la pizza: ")
    descripcion = input("Ingrese la descripción: ")
    ingredientes = int(input("Ingrese la cantidad de ingredientes: "))

    pedido1.setTamanio(tamanio)
    pedido1.setDescripcion(descripcion)
    pedido1.setIngredientes(ingredientes)

    pedido1.generarResumenPedido()

    pedido2 = PedidoPizza("chica", 0, "Vegetariana")

    pedido2.generarResumenPedido()


if __name__ == "__main__":
    main()