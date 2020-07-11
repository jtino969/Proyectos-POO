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
public class Lineas extends Forma{
    
    public Lineas(){
        setNombre("Linea");
        setDato("Largo");
        setCalculo(calculo);
    }
    private void setCalculo(double d) {
        calculo = 25*4;
  }
    
}
