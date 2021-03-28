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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benja
 */
public abstract class Figura {
    float area;
    float vol;
    float perim;
    
    Figura(){
      area=vol=0;
    }
   void pedir_datos(){
     System.out.println("Introduce los siguientes datos:");
   } 
   void calc_area(){
     System.out.println("El Area es:");
   }
   void calc_perim(){
     System.out.println("El perimetro es:");
   }
   void calc_vol(){
     System.out.println("El volumen es:");
   }
}
