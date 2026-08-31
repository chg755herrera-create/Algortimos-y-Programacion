import java.util.Scanner;

class Empleado {

    public String nombre;
    public String apellidoPaterno;
    public double salarioMensual;

    public Empleado(String nom, String apellido, double salario) {
        nombre = nom;
        apellidoPaterno = apellido;

        if (salario > 0)
            salarioMensual = salario;
        else
            salarioMensual = 0.0;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre;
        String apellido;
        double salario;

        System.out.println("Datos del Empleado 1");

        System.out.print("Nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Apellido paterno: ");
        apellido = teclado.nextLine();

        System.out.print("Salario mensual: ");
        salario = teclado.nextDouble();
        teclado.nextLine();

        Empleado emp1 = new Empleado(nombre, apellido, salario);

        System.out.println("\nDatos del Empleado 2");

        System.out.print("Nombre: ");
        nombre = teclado.nextLine();

        System.out.print("Apellido paterno: ");
        apellido = teclado.nextLine();

        System.out.print("Salario mensual: ");
        salario = teclado.nextDouble();

        Empleado emp2 = new Empleado(nombre, apellido, salario);

        System.out.println("\nSalarios anuales antes del aumento:");

        System.out.println(emp1.nombre + " " + emp1.apellidoPaterno +
                ": $" + emp1.obtenerSalarioAnual());

        System.out.println(emp2.nombre + " " + emp2.apellidoPaterno +
                ": $" + emp2.obtenerSalarioAnual());

        emp1.salarioMensual *= 1.10;
        emp2.salarioMensual *= 1.10;

        System.out.println("\nSalarios anuales despues del aumento del 10%:");

        System.out.println(emp1.nombre + " " + emp1.apellidoPaterno +
                ": $" + emp1.obtenerSalarioAnual());

        System.out.println(emp2.nombre + " " + emp2.apellidoPaterno +
                ": $" + emp2.obtenerSalarioAnual());

        teclado.close();
    }
}