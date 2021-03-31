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
public class Rectangulo implements Figura{
   float base;
   float altura;
   float area;
    float vol;
    float perim;

   Rectangulo(){
     base=altura=area=vol=perim=0;
    }
public void pedir_datos(){
       Scanner leer=new Scanner (System.in);
      System.out.println("Introduce los siguientes datos:");
     System.out.println("lado1:");
     base=leer.nextFloat();
     System.out.println("lado2:");
     altura=leer.nextFloat();
   } 
 public   void calc_area(){
     area=base*altura;
    System.out.println("El Area es:");
     System.out.println(area);
   }
 public  void calc_perim(){
     perim=(base+altura)*2;
 System.out.println("El perimetro es:");
     System.out.println(perim);
   }
 public  float get_area(){
    return area;
  }
  
 public  void calc_vol(){
 System.out.println("El volumen es:");
 }
 
} 