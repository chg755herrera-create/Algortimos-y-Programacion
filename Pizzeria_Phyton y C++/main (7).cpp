#include <iostream>
#include "Pizzeria.h"
using namespace std;

int main(){
    //==PRIMER OBJETO==
    PedidoPizza pedido1;
    
    pedido1.setTamanio("grande");
    pedido1.setDescripcion("Masa tradicional");
    pedido1.setIngredientes(2);
    pedido1.generarResumenPedido();
    
    cout<<endl;
    
    PedidoPizza pedido2("chica",0,"Vegetariana");
    pedido2.generarResumenPedido();
    
    cout<<endl;
    
    
    return 0;
    
}