#include <iostream>

using namespace std;

class Fecha {

public:

    int mes;
    int dia;
    int anio;

    Fecha(int mes, int dia, int anio) {
        this->mes = mes;
        this->dia = dia;
        this->anio = anio;
    }

    void mostrarFecha() {
        cout << mes << "/" << dia << "/" << anio << endl;
    }
};

int main() {

    Fecha fecha1(8, 30, 2026);
    Fecha fecha2(12, 25, 2026);

    cout << "Fecha 1:" << endl;
    fecha1.mostrarFecha();

    cout << "Fecha 2:" << endl;
    fecha2.mostrarFecha();

    return 0;
}