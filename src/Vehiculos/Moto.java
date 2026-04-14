/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author black
 */
public class Moto extends Vehiculo{
    private int cilindrada;
    public Moto(String tipo,String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
        
    }
    public void mostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("cilindrada: " + cilindrada);
    }
    
}
