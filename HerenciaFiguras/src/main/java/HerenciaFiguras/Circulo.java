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
public class Circulo extends Figura{
    
    float radio;
    
    Circulo (){
    
    radio=0;
    }
    
    void pedir_datos(){
       Scanner leer=new Scanner (System.in);
       super.pedir_datos();
     System.out.println("Radio :");
   radio=leer.nextFloat();
    }
    
    void calc_area(){
     area= (float)Math.PI * (radio * radio); // hice casting de double a float
     super.calc_area();
     System.out.println(area);
   }
    
    void calc_perim(){
     perim= (float)Math.PI * (radio * 2);
     super.calc_perim();
     System.out.println(perim);
   }
    
    float get_area(){
    return area;
  }
}
