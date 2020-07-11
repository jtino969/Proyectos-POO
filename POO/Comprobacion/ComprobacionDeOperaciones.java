/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprobacion;

/**
 *
 * @author personal
 */
public class ComprobacionDeOperaciones {
    
    
        public static void main(String[] args) {
         int M=6;
        int T=1;
        int K=-10;

        if(M > T){
            System.out.println("VERDADERO");
        }else if(M < T){
            System.out.println("FALSO");
        }
        if(T / K == -5){
            System.out.println("FALSO");      
       }else {
            System.out.println("FALSO");
        }
        if(M+T == 7 || M-T == 5){
            System.out.println("VERDADERO");
    }else if(M-T == 7 || M+T == 5){
            System.out.println("FALSO");
        }
      }
}
