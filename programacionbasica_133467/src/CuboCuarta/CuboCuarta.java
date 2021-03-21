/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuboCuarta;

/**
 *
 * @author Benjamin Joaquin Martinez
 */
import java.util.Scanner;
public class CuboCuarta {
    
   double numeros[] = new double[10];
    double numerosCubo[] = new double[10];
     double numerosCuarta[] = new double[10];
   
   
   public void leerNumeros(){
       int contador=0;
      
          Scanner leer= new Scanner (System.in);
       while (contador<10){
            System.out.println("Introduzca nuevo numero");
           numeros[contador]= leer.nextDouble();
       contador++;
       }
   
   }
    
   public void obtenerCubo(){
    int contador=0;
      while (contador<10){
          numerosCubo[contador]= Math.pow(numeros[contador],3);
      contador++;
      }
      
   }
   
      public void obtenerCuarta(){
    int contador=0;
      while (contador<10){
          numerosCuarta[contador]= Math.pow(numeros[contador],4);
      contador++;
      }
   }
   
      
    public void imprimirDatos(){
  
    
    int contador=0;
    System.out.println("Numero\tCubo\tCuarta");
    while(contador<10){
    
    System.out.println(numeros[contador]
            +"\t"+numerosCubo[contador]
            +"\t"+numerosCuarta[contador]);
    contador++;
    
    }
    }
    
    
    
    public static void main (String [] args){
    
        CuboCuarta c = new CuboCuarta();
        c.leerNumeros();
        c.obtenerCubo();
        c.obtenerCuarta();
        c.imprimirDatos();
    }
}
