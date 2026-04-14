/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba;
import vehiculos.Vehiculo;
import vehiculos.Moto;
        
/**
 *
 * @author black
 */
public class test {
    public static void main(String[] args) {
        Vehiculo V = new Vehiculo("carro");
        Moto M = new Moto("Deportiva");
        
        V.mostrar();
        M.mostrar();
    }
    
}
