/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compañeros;

/**
 *
 * @author personal
 */
public class Compañeros {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[]personas=new String[10];
		int []edades=new int[8];
		boolean[] estados=new boolean[6];


		personas[0]="Gabriela Yanez";
		personas[1]="Ruth Juarez";
                personas[2]="Wilson Paz";
                personas[3]="Genaro Tinoco";
                personas[4]="David Mejia";
                personas[5]="Ana Chavez";
                personas[6]="Juan Argueta";
                personas[7]="Dany Cruz";
                personas[8]="Cristian Hernandez";
                personas[9]="Juan Zuniga";


		for(int posicion =0;posicion< personas.length;posicion++){
			System.out.println("Persona["+posicion+"]="+personas[posicion]);
  }
 }
}
