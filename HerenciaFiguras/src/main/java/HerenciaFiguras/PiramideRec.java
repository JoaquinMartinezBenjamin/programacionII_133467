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
public class PiramideRec extends Rectangulo{
    float altura; 
    
     public PiramideRec(){
     
     altura = 0 ; 
     } 
    
     void pedir_datos(){
         Scanner leer=new Scanner(System.in);
         super.pedir_datos();
     System.out.println("Introduzca altura de la piramide:");
     altura=leer.nextFloat();
   } 
     
      void calc_vol(){
      super.calc_area();
      vol=(this.altura*super.get_area())/3;
      super.calc_vol();
     System.out.println(vol);
   }
     
}
