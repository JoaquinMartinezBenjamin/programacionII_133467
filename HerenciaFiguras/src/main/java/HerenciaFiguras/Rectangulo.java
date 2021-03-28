/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaFiguras;

/**
 *
 * @author benja
 */
import java.util.*;
public class Rectangulo extends Figura{
   float base;
   float altura;
   
   Rectangulo(){
     base=altura=0;
    }
   void pedir_datos(){
       Scanner leer=new Scanner (System.in);
       super.pedir_datos();
     System.out.println("lado1:");
     base=leer.nextFloat();
     System.out.println("lado2:");
     altura=leer.nextFloat();
   } 
   void calc_area(){
     area=base*altura;
     super.calc_area();
     System.out.println(area);
   }
   void calc_perim(){
     perim=(base+altura)*2;
     super.calc_perim();
     System.out.println(perim);
   }
  float get_area(){
    return area;
  }
}