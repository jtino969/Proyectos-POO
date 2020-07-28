/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConvertidorDeMonedasUTH;

/**
 *
 * @author personal
 */
public class Operaciones {
    
    
   private double valor, resultado;
   private int divisa, divisafinal;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }


   
 //constructor

    public Operaciones() {
    }
    
 // operaciones
    
    public double convertir(){
        
        if (divisa==0  && divisafinal==1){//Lempiras a Dolares
            resultado = valor * 0.040;
            
        }else if (divisa==0  && divisafinal==0){
            resultado = valor;
        
        return resultado;
    }
  }
    
}