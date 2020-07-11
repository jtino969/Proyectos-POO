/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPERS;

/**
 *
 * @author personal
 */
public class Circulo extends Forma{
    
     public Circulo(){
        setNombre("Circulo");
        setDato("Radio");
        setCalculo(calculo);
    }

    private void setCalculo(double d) {
        calculo = 10/2*3.1416;
    }   
    
}
