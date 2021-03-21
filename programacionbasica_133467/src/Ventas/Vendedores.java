/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author benja
 */
public class Vendedores {
    
    public double sueldoBase;
    public double comisiones;
    public double pagoTotal;
    public String id;
    public Vendedores(String id,double sueldoBase,double venta1,double venta2, double venta3){
    this.sueldoBase= sueldoBase;
    this.id=id;
    calcularComisiones(venta1,venta2,venta3);
    calcularPagoTotal();
    }
    
    
    public void calcularComisiones(double venta1,double venta2, double venta3)
    {
    venta1= (venta1/100)*10;    
    venta2= (venta2/100)*10; 
    venta3= (venta3/100)*10; 
    comisiones= venta1+venta2+venta3;
    }
    
    public void calcularPagoTotal(){
    pagoTotal= sueldoBase+comisiones;
    }
    
    
    public static void main (String [] args){
    
     ArrayList<Vendedores> trabajadores = new ArrayList<Vendedores>();
      Scanner leer= new Scanner (System.in);
         int centinela= 1;
         double sueldoBase=0; 
         double venta1,venta2,venta3=0;
         String id="";
      do{
         System.out.println("Introduzca ID del empleado (NOMBRE)");
         id = leer.next();
         
        
          
        System.out.println("Introduzca sueldo base del empleado");
        sueldoBase = leer.nextDouble();
        
         System.out.println("Introduzca monto de venta1 del empleado");
        venta1 = leer.nextDouble();
        
        System.out.println("Introduzca monto de venta2 del empleado");
        venta2 = leer.nextDouble();
        
        
         System.out.println("Introduzca monto de venta3 del empleado");;
        venta3 = leer.nextDouble();
        
        trabajadores.add(new Vendedores(id,sueldoBase,venta1,venta2,venta3));
        
      System.out.println("Para continuar introduciendo trabajadores digite  numero diferente de 0");
       System.out.println("Para dejar de  introducir trabajadores digite 0");
       centinela= leer.nextInt();
       
      }while(centinela!=0);
      
      
       for (int i=0;i<trabajadores.size();i++) {
      System.out.println("Empleado\tComisiones\tSalario total");
    System.out.print(trabajadores.get(i).id+"\t");
      System.out.print(trabajadores.get(i).comisiones+"\t");
        System.out.print(trabajadores.get(i).pagoTotal+"\n");
     
    }
      
      
      
    }
    
}
