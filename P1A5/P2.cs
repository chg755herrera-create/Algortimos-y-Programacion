using System;

class Empleado
{
    public string nombre;
    public string apellidoPaterno;
    public double salarioMensual;

    public Empleado(string nom, string apellido, double salario)
    {
        nombre = nom;
        apellidoPaterno = apellido;

        if (salario > 0)
            salarioMensual = salario;
        else
            salarioMensual = 0.0;
    }

    public double obtenerSalarioAnual()
    {
        return salarioMensual * 12;
    }
}

class EmpleadoTest
{
    static void Main(string[] args)
    {
        string nombre;
        string apellido;
        double salario;

        Console.WriteLine("Datos del Empleado 1");

        Console.Write("Nombre: ");
        nombre = Console.ReadLine();

        Console.Write("Apellido paterno: ");
        apellido = Console.ReadLine();

        Console.Write("Salario mensual: ");
        salario = double.Parse(Console.ReadLine());

        Empleado emp1 = new Empleado(nombre, apellido, salario);

        Console.WriteLine("\nDatos del Empleado 2");

        Console.Write("Nombre: ");
        nombre = Console.ReadLine();

        Console.Write("Apellido paterno: ");
        apellido = Console.ReadLine();

        Console.Write("Salario mensual: ");
        salario = double.Parse(Console.ReadLine());

        Empleado emp2 = new Empleado(nombre, apellido, salario);

        Console.WriteLine("\nSalarios anuales antes del aumento:");

        Console.WriteLine(emp1.nombre + " " + emp1.apellidoPaterno +
                          ": $" + emp1.obtenerSalarioAnual());

        Console.WriteLine(emp2.nombre + " " + emp2.apellidoPaterno +
                          ": $" + emp2.obtenerSalarioAnual());

        emp1.salarioMensual *= 1.10;
        emp2.salarioMensual *= 1.10;

        Console.WriteLine("\nSalarios anuales despues del aumento del 10%:");

        Console.WriteLine(emp1.nombre + " " + emp1.apellidoPaterno +
                          ": $" + emp1.obtenerSalarioAnual());

        Console.WriteLine(emp2.nombre + " " + emp2.apellidoPaterno +
                          ": $" + emp2.obtenerSalarioAnual());
    }
}