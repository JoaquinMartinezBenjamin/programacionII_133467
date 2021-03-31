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
public class Triangulo implements Figura{
    float A,B,C,H;
 float area;
    float vol;
    float perim;
    Triangulo() {

    A=B=C=H=area=vol=perim=0;
    }


  public   void pedir_datos(){
       Scanner leer=new Scanner (System.in);
     
 System.out.println("Introduce los siguientes datos:");
       System.out.println("Introduzca lado A :");
     A=leer.nextFloat();

       System.out.println("Introduzca lado B:");
     B=leer.nextFloat();

       System.out.println("Introduzca lado C:");
     C=leer.nextFloat();



     }

    public  void calc_area(){
          float S= (A + B + C)/2;
     area= (float)Math.sqrt(S*((S-A)*(S-B)*(S-C))); // por formula de heron para 3 lados
     System.out.println("El Area es:");
     System.out.println(area);
   }

      public void calc_perim(){
     perim=A+B+C;
     System.out.println("El perimetro es:");
     System.out.println(perim);
   }
  float get_area(){
    return area;
  }


    
 public  void calc_vol(){
     
     System.out.println("El volumen es :");
 }
  

        }