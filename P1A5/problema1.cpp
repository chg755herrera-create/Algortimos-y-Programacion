#include <iostream>
using namespace std;

class Factura {
    
public: 
    
    string numPieza;
    string descripcion;
    int cantidad;
    double precio;
    
    //construcctor 
    
    Factura(){
        numPieza = "";
        descripcion = "";
        cantidad = 0;
        precio = 0.0;
        
    }
    
    //metodo para obtener la factura 
    
    double obtenerMonFactura(){
        //regresa el contenido cuando es invocado
        return cantidad*precio;
    }
    
};

//factura test 

int main() {
    
    Factura ferre;
    
  
    cout << "Numero de pieza: ";
    cin >> ferre.numPieza; 

    cout << "Descripcion: ";
    cin >> ferre.descripcion; 
    
    cout << "Cantidad: ";
    cin >> ferre.cantidad; 
    
    cout << "Precio: ";
    cin >> ferre.precio; 
    
    if (ferre.precio<0) ferre.precio = 0.0;
    if (ferre.cantidad<0) ferre.cantidad = 0;
    
    cout<<"Factura: "<< ferre.obtenerMonFactura() <<endl;
   

    return 0;
}