/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author black
 */
class Vehiculo {
    String tipo;
    
    Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    void mostrar() {
        System.out.println("Tipo: " + tipo);
    }
    
}
