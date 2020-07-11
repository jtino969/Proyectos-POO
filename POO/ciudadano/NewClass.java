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
public class NewClass {
    
    
    
    public class ciudadano {
private String nombre;
    private int edad;
    private int experiencia;



      public void establecerNombre(String nomb){
      this.nombre = nomb;

      }
      public String obtenerNombre(){
      return nombre;
      }
      public void establecerEdad(int años){
      this.edad = años;

      }
      public int obtenerEdad(){
      return edad;
      }

      public void establecerExperiencia(int exp){
      this.experiencia = exp;

      }
      public int obtenerExperiencia(){
      return experiencia;
      }

}
}