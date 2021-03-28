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
public class Triangulo extends Figura{
    float A,B,C,H;
    
    Triangulo() {
    
    A=B=C=H=0;
    }
    
    
     void pedir_datos(){
       Scanner leer=new Scanner (System.in);
       super.pedir_datos();
       
       System.out.println("Introduzca lado A :");
     A=leer.nextFloat();
     
       System.out.println("Introduzca lado B:");
     B=leer.nextFloat();
     
       System.out.println("Introduzca lado C:");
     C=leer.nextFloat();
     
      
     
     }
     
      void calc_area(){
          float S= (A + B + C)/2;
     area= (float)Math.sqrt(S*((S-A)*(S-B)*(S-C))); // por formula de heron para 3 lados
     super.calc_area();
     System.out.println(area);
   }
      
      void calc_perim(){
     perim=A+B+C;
     super.calc_perim();
     System.out.println(perim);
   }
  float get_area(){
    return area;
  }
    
    
}
