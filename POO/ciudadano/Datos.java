/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciudadano;

/**
 *
 * @author personal
 */
public class Datos {
    
    
    
     public static void main(String[] args) {
     Ciudadano ciudadano = new Ciudadano();



        ciudadano.establecerNombre("Jorge Tinoco");
        ciudadano.establecerEdad(55);
        ciudadano.establecerExperiencia(10);

        System.out.println("Nombre: " + ciudadano.obtenerNombre());

        System.out.println("Edad: " + ciudadano.obtenerEdad() + " años");

        System.out.println("Años de experiencia: " + ciudadano.obtenerExperiencia());
    }

}
    


