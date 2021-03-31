/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasInterfaces;

/**
 *
 * @author benja
 */
import java.util.Scanner;
public class Cono extends Circulo{
    float altura; 

     public Cono(){

     altura = 0 ; 
     } 

    public void pedir_datos(){
         Scanner leer=new Scanner(System.in);
         super.pedir_datos();
     System.out.println("Introduzca altura del cono:");
     altura=leer.nextFloat();
   } 

     public void calc_vol(){
      super.calc_area();
      vol=(this.altura*super.get_area())/3;
      super.calc_vol();
     System.out.println(vol);
   }

}
