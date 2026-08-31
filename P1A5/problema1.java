import java.util.Scanner;

class Factura {

    public String numPieza;
    public String descripcion;
    public int cantidad;
    public double precio;

    // Constructor
    public Factura() {
        numPieza = "";
        descripcion = "";
        cantidad = 0;
        precio = 0.0;
    }

    // Método para obtener el monto de la factura
    public double obtenerMonFactura() {
        return cantidad * precio;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Factura ferre = new Factura();

        System.out.print("Numero de pieza: ");
        ferre.numPieza = teclado.next();

        System.out.print("Descripcion: ");
        ferre.descripcion = teclado.next();

        System.out.print("Cantidad: ");
        ferre.cantidad = teclado.nextInt();

        System.out.print("Precio: ");
        ferre.precio = teclado.nextDouble();

        if (ferre.precio < 0) {
            ferre.precio = 0.0;
        }

        if (ferre.cantidad < 0) {
            ferre.cantidad = 0;
        }

        System.out.println("Factura: " + ferre.obtenerMonFactura());

        teclado.close();
    }
}