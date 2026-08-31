// ChristopherHG

#include <iostream>
#include <string>

using namespace std;

class Empleado {

public:

    string nombre;
    string apellidoPaterno;
    double salarioMensual;

    Empleado(string nom, string ape, double salario) {
        nombre = nom;
        apellidoPaterno = ape;

        if (salario > 0)
            salarioMensual = salario;
        else
            salarioMensual = 0.0;
    }

    double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }
};

int main() {

    string nombre, apellido;
    double salario;

    cout << "Datos del Empleado 1" << endl;
    cout << "Nombre: ";
    cin >> nombre;
    cout << "Apellido paterno: ";
    cin >> apellido;
    cout << "Salario mensual: ";
    cin >> salario;

    Empleado emp1(nombre, apellido, salario);

    cout << "\nDatos del Empleado 2" << endl;
    cout << "Nombre: ";
    cin >> nombre;
    cout << "Apellido paterno: ";
    cin >> apellido;
    cout << "Salario mensual: ";
    cin >> salario;

    Empleado emp2(nombre, apellido, salario);

    cout << "\nSalarios anuales antes del aumento:" << endl;
    cout << emp1.nombre << " " << emp1.apellidoPaterno
         << ": $" << emp1.obtenerSalarioAnual() << endl;

    cout << emp2.nombre << " " << emp2.apellidoPaterno
         << ": $" << emp2.obtenerSalarioAnual() << endl;

    emp1.salarioMensual *= 1.10;
    emp2.salarioMensual *= 1.10;

    cout << "\nSalarios anuales despues del aumento del 10%:" << endl;
    cout << emp1.nombre << " " << emp1.apellidoPaterno
         << ": $" << emp1.obtenerSalarioAnual() << endl;

    cout << emp2.nombre << " " << emp2.apellidoPaterno
         << ": $" << emp2.obtenerSalarioAnual() << endl;

    return 0;
}