/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import java.util.Scanner;

/**
 *
 * @author personal
 */
public class Operadores {
    
    
    public static void main(String[] args) {
        System.out.println(" Seleccione una opción");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Mod");

		int opcion = 0;
		int numero1 = 0;
		int numero2 = 0;
		double resultado = 0;

		Scanner teclado = new Scanner(System.in);

		opcion = teclado.nextInt();

		System.out.println("Ingrese el primero numero:");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero:");
		numero2 = teclado.nextInt();


		switch (opcion) {
		case 1:
			//SELECCIONO SUMAR
			resultado = numero1 + numero2;
			System.out.println("La suma es: "+resultado);
			break;
		case 2:
			//SELECCIONO RESTAR
			resultado = numero1 - numero2;
			System.out.println("La resta es: "+resultado);
			break;
		case 3:
			//SELECCIONO MULTIPLICAR
			resultado = numero1 * numero2;
			System.out.println("La multiplicacion es: "+resultado);
			break;
		case 4:
			//SELECCIONO DIVIDIR
			if(numero2 == 0){
				System.out.println("No se permite dividir por 0");
			}else{
				resultado = numero1 / numero2;
				System.out.println("La división es: "+resultado);
			}
			break;
                case 5:
                    //SELECCIONO MOD
                      int modulo;
                      modulo=numero1 % numero2;
                      System.out.println("El resultado es:"+ modulo);
   }
    }
}