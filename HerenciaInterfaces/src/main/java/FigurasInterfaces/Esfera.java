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

public class Esfera extends Circulo {

    Esfera () {

    } 


    public void calc_vol(){
      super.pedir_datos();
      vol= ((float)(Math.PI * 4)/3) * (radio*radio*radio);
      super.calc_vol();
     System.out.println(vol);
   }

    
    
}
