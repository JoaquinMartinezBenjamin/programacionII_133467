/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PorcentajeAnimales;

/**
 *
 * @author benja
 */
import java.util.*;
public class PorcentajeAnimales {
    
    int tipoAnimal;
    
    public PorcentajeAnimales(int tipoAnimal){
    this.tipoAnimal = tipoAnimal;
    }
    
    
    public void calcularPorcentaje(){
    
    
    if(tipoAnimal==1){
    porcentajeElefantes();
                     }
    if(tipoAnimal==2){
    porcentajeJirafas();
                     }
    if(tipoAnimal==3){
    porcentajeChimpances();
                     }
    }
    
    public void porcentajeElefantes(){
        int contador=0;
        double edad=0;
        double edad0_1=0;
        double edad1_3=0;
        double edad3_mas=0;
        do{
        System.out.println("Introduzca la edad en meses del elefante"+(contador+1));
        Scanner leer= new Scanner (System.in);
        edad= leer.nextDouble();
        
        edad=edad/12;
        if (edad<1){edad0_1++;}
        if (edad>=1 && edad <3){edad1_3++;}
        if (edad>=3){edad3_mas++;}
        contador++;
        
        } while (contador<20);
        
        
        edad0_1= (edad0_1 * 100)/20;
        edad1_3=(edad1_3  * 100)/20;
        edad3_mas=(edad3_mas * 100)/20;
   System.out.println("El porcentaje de elefantes menores de un anio es "
           +edad0_1 +"%" );
   System.out.println("El porcentaje de elefantes mayores de un anio y menores de tres es "
           +edad1_3 +"%");
   System.out.println("El porcentaje de elefantes de 3 anios o mas  es "
           +edad3_mas+"%");
   
    }
    
    
   public void porcentajeJirafas(){
   
        int contador=0;
        double edad=0;
        double edad0_1=0;
        double edad1_3=0;
        double edad3_mas=0;
        do{
        System.out.println("Introduzca la edad en meses de la jirafa"+(contador+1));
        Scanner leer= new Scanner (System.in);
        edad= leer.nextDouble();
        
        edad=edad/12;
        if (edad<1){edad0_1++;}
        if (edad>=1 && edad <3){edad1_3++;}
        if (edad>=3){edad3_mas++;}
        contador++;
        
        } while (contador<15);
        
        
        edad0_1= (edad0_1 * 100)/15;
        edad1_3=(edad1_3  * 100)/15;
        edad3_mas=(edad3_mas * 100)/15;
   System.out.println("El porcentaje de jirafas menores de un anio es "
           +edad0_1 +"%" );
   System.out.println("El porcentaje de jirafas mayores de un anio y menores de tres es "
           +edad1_3 +"%");
   System.out.println("El porcentaje de jirafas de 3 anios o mas  es "
           +edad3_mas+"%");
   }
   
   
   public void porcentajeChimpances(){
   
         int contador=0;
        double edad=0;
        double edad0_1=0;
        double edad1_3=0;
        double edad3_mas=0;
        do{
        System.out.println("Introduzca la edad en meses del chimpance"+(contador+1));
        Scanner leer= new Scanner (System.in);
        edad= leer.nextDouble();
        
        edad=edad/12;
        if (edad<1){edad0_1++;}
        if (edad>=1 && edad <3){edad1_3++;}
        if (edad>=3){edad3_mas++;}
        contador++;
        
        } while (contador<40);
        
        
        edad0_1= (edad0_1 * 100)/40;
        edad1_3=(edad1_3  * 100)/40;
        edad3_mas=(edad3_mas * 100)/40;
   System.out.println("El porcentaje de chimpances menores de un anio es "
           +edad0_1 +"%" );
   System.out.println("El porcentaje de chimpances mayores de un anio y menores de tres es "
           +edad1_3 +"%");
   System.out.println("El porcentaje de chimpances de 3 anios o mas  es "
           +edad3_mas+"%");
   }
    
   
   
   public static void main (String [] args){
   
   System.out.println("Introduzca el tipo de animal");
    System.out.println("Digite 1 para elefantes");
     System.out.println("Digite 2 para jirafas");
      System.out.println("Digite 3 para chimpances");
      
      Scanner leer= new Scanner (System.in);
      int tipo = leer.nextInt();
      
         
      PorcentajeAnimales p= new PorcentajeAnimales(tipo);
      p.calcularPorcentaje();
   
   
   }
   
    
    }
    
    
    

