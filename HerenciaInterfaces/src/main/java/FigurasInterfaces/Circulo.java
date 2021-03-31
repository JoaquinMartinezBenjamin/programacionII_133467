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
public class Circulo implements Figura{
 float area;
    float vol;
    float radio;
    float perim;

    Circulo (){

  area=vol=radio=perim=0;
    }

   public void pedir_datos(){
       Scanner leer=new Scanner (System.in);
        System.out.println("Introduce los siguientes datos:");
     System.out.println("Radio :");
   radio=leer.nextFloat();
    }

   public void calc_area(){
     area= (float)Math.PI * (radio * radio); // hice casting de double a float
       System.out.println("El Area es:");
     System.out.println(area);
   }

   public void calc_perim(){
     perim= (float)Math.PI * (radio * 2);
     System.out.println("El perimetro es:");
     System.out.println(perim);
   }

    public float get_area(){
    return area;
  }
    
    
    public void calc_vol(){
     
     System.out.println("El volumen es :");
 }
  
    
}
