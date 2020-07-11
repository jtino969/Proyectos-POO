/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paises;


import helpers.Honduras;
import helpers.Guatemala;
import helpers.ElSalvador;
import helpers.Nicaragua;
import helpers.CostaRica;


/**
 *
 * @author personal
 */
public class NewClass {
 
    
    public static void main(String[] args) {
        // TODO code application logic here
           Honduras a= new Honduras();
           Guatemala b= new Guatemala();
           ElSalvador c= new ElSalvador();
           Nicaragua d= new Nicaragua();
           CostaRica e= new CostaRica();

            System.out.println(a.getPais() + a.getPresidente() );
            System.out.println(b.getPais() + b.getPaises() );
            System.out.println(c.getPais() + c.getPresidente() );
            System.out.println(d.getPais() + d.getPresidente() );
            System.out.println(e.getPais() + e.getPresidente() );


}
    


