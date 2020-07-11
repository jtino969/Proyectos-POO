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
public class Arreglo {
    
     public static void main(String[] args) {
         Estudiante hola []= new Estudiante [5];

        String nombre;
        String apellido;
        String carrera;
        String trabajo;
        Scanner teclado=new Scanner(System.in);

        for( int i=0;i<hola.length;i++){
            System.out.println("Ingrese el Nombre");
            nombre=teclado.nextLine();
            System.out.println("Ingrese el Apellido");
            apellido=teclado.nextLine();
            System.out.println("Ingrese la Carrera");
            carrera=teclado.nextLine();
            System.out.println("Ingrese el Trabajo");
            trabajo=teclado.nextLine();
            hola[i]=new Estudiante(nombre,apellido,carrera,trabajo);
             }
        for( int i=0;i<hola.length;i++){
            System.out.println(hola[i].getNombre()+"_"+hola[i].getApellido()+"_"+hola[i].getCarrera()+"_ruth"+hola[i].getTrabajo());
        }
        }
}
