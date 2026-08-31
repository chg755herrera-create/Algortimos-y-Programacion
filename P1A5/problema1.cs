// ChristopherHG

using System;

class Factura
{
    public string numPieza;
    public string descripcion;
    public int cantidad;
    public double precio;

    // Constructor
    public Factura()
    {
        numPieza = "";
        descripcion = "";
        cantidad = 0;
        precio = 0.0;
    }

    // Método para obtener el monto de la factura
    public double obtenerMonFactura()
    {
        return cantidad * precio;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Factura ferre = new Factura();

        Console.Write("Numero de pieza: ");
        ferre.numPieza = Console.ReadLine();

        Console.Write("Descripcion: ");
        ferre.descripcion = Console.ReadLine();

        Console.Write("Cantidad: ");
        ferre.cantidad = int.Parse(Console.ReadLine());

        Console.Write("Precio: ");
        ferre.precio = double.Parse(Console.ReadLine());

        if (ferre.precio < 0)
            ferre.precio = 0.0;

        if (ferre.cantidad < 0)
            ferre.cantidad = 0;

        Console.WriteLine("Factura: " + ferre.obtenerMonFactura());
    }
}