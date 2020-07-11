/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

/**
 *
 * @author personal
 */
public class Estudiante {

      private String nombre;
    private String apellido;
    private String carrera;
    private String trabajo;

    Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void Alumno(){
        nombre="";
        apellido="";
        carrera="";
        trabajo="";

    }
    public Estudiante(String a,String b,String c,String d){
        nombre=a;
        apellido=b;
        carrera=c;
        trabajo=d;
    }

    public  String getNombre(){
      return nombre;
    }
    public void setnombre(String m){ 
        this.nombre=nombre;
    }
    public  String getApellido(){  
     return apellido;
    }
     public void setapellido(String n){ 
        this.apellido=apellido;
    }
     public  String getCarrera(){
      return carrera;
    } public void setcarrera(String x){ 
        this.carrera=carrera;
    }
     public  String getTrabajo(){
      return trabajo;
    } public void settrabajo(String y){ 
        this.trabajo=trabajo;
    }
}
