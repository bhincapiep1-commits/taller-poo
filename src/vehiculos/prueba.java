/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Moto;
/**
 *
 * @author black
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo V = new Vehiculo("Carro");
        Moto M = new Moto("Deportista");
        V.mostrar();
        M.mostrar();
        // TODO code application logic here
    }
    
}
