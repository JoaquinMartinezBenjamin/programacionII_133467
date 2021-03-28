/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaFiguras;

import java.util.Scanner;

/**
 *
 * @author benja
 */
public class Cilindro extends Circulo {
    float altura;
    
    Cilindro(){
      altura=0;
    }
    
     void pedir_datos(){
         Scanner leer=new Scanner(System.in);
         super.pedir_datos();
     System.out.println("Introduzca altura del cilindro:");
     altura=leer.nextFloat();
   } 
     
      void calc_vol(){
      super.calc_area();
      vol=this.altura*super.get_area();
      super.calc_vol();
     System.out.println(vol);
   }
     
}