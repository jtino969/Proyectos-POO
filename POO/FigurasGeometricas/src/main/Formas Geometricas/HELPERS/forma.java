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
public class forma {
    
         private String nombre;

private String dato;

public double calculo; 

public Forma(){

}

  public void setNombre(String nombre){
      this.nombre = nombre;
  }

  public String getNombre(){
  return this.nombre;
  }

  public void setDato(String dato){
      this.dato = dato;
  }

  public String getDato(){
  return this.dato;
  }

  public void setcalculo(String dato){
      this.calculo = calculo;

  }

  public String getCalculo(){
  return this.dato;
  }

  public void Dibujar(){
      System.out.println("Figura: " + nombre);
      System.out.println("Calculo: " + dato);
      System.out.println("Resultado: " + calculo);
  }
    
}
