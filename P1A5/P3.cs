using System;

class Fecha
{
    public int mes;
    public int dia;
    public int anio;

    public Fecha(int mes, int dia, int anio)
    {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void mostrarFecha()
    {
        Console.WriteLine(mes + "/" + dia + "/" + anio);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Fecha fecha1 = new Fecha(8, 30, 2026);
        Fecha fecha2 = new Fecha(12, 25, 2026);

        Console.WriteLine("Fecha 1:");
        fecha1.mostrarFecha();

        Console.WriteLine("Fecha 2:");
        fecha2.mostrarFecha();
    }
}