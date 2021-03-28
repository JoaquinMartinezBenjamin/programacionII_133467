/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilidadTrabajador;

/**
 *
 * @author Benjamin Joaquin Martinez
 */

import java.util.*;
public class UtilidadTrabajador {
    
   double tiempoUtilidad;
   String idTrabajador;
   double salarioMensual;
   double utilidad;
   double salarioTotal;
   
   public UtilidadTrabajador(String idTrabajador,double salarioMensual,double tiempoUtilidad){
   this.idTrabajador=idTrabajador;
   this.salarioMensual=salarioMensual;
   this.tiempoUtilidad=tiempoUtilidad;
   utilidad=0;
   calcularUtilidadMasdeUnAnio();
   }
   
   
    public UtilidadTrabajador(String idTrabajador,double salarioMensual,double tiempoUtilidad,double salarioTotal){
   this.idTrabajador=idTrabajador;
   this.salarioMensual=salarioMensual;
   this.tiempoUtilidad=tiempoUtilidad;
   this.salarioTotal=salarioTotal;
   utilidad=0;
   calcularUtilidadMenosdeUnAnio(salarioTotal);
   }
   
   
    public void calcularUtilidadMenosdeUnAnio(double salarioTotal){ 
        
       utilidad= (salarioTotal/100) * 5;
   
    }
    
   public void calcularUtilidadMasdeUnAnio(){
   

   if(tiempoUtilidad >=1 && tiempoUtilidad <2){utilidad= ((12 * salarioMensual)/100) * 7;}
   if(tiempoUtilidad >=2 && tiempoUtilidad <5){utilidad= ((12 * salarioMensual)/100) * 10;}
   if(tiempoUtilidad >=5 && tiempoUtilidad <10){utilidad= ((12 * salarioMensual)/100) * 15;}
   if(tiempoUtilidad >10){utilidad= ((12 * salarioMensual)/100) * 20;}
   }
   
   
   public static void main (String [] args){
   ArrayList<UtilidadTrabajador> trabajadores = new ArrayList<UtilidadTrabajador>();
    Scanner leer= new Scanner (System.in);
    double salarioTotal=0;
    int centinela= 1;
    
    while(centinela!=0){
    
    System.out.println("Introduzca el identificador del empleado (nombre)");
    String idTrabajador=leer.next();
    System.out.println("Introduzca el salario que recibe al mes el empleado");
    double salarioMensual=leer.nextDouble();
    System.out.println("Introduzca el tiempo de antigu_edad en meses");
    double tiempoAntiguedad = leer.nextDouble();
    if (tiempoAntiguedad<12) {salarioTotal=tiempoAntiguedad * salarioMensual;
   trabajadores.add(new UtilidadTrabajador(idTrabajador,salarioMensual,tiempoAntiguedad,salarioTotal));
    
    }else
    {
       tiempoAntiguedad= tiempoAntiguedad/12;
      trabajadores.add(new UtilidadTrabajador(idTrabajador,salarioMensual,tiempoAntiguedad));
    }
       System.out.println("Para continuar introduciendo trabajadores digite  numero diferente de 0");
       System.out.println("Para dejar de  introducir trabajadores digite 0");
       centinela= leer.nextInt();
    }
    
    for (int i=0;i<trabajadores.size();i++) {
      System.out.println("Trabajador\tSalarioMensual\tTiempoAntigu-edad\tUtilidad");
    System.out.print(trabajadores.get(i).idTrabajador+"\t");
      System.out.print(trabajadores.get(i).salarioMensual+"\t");
        System.out.print(trabajadores.get(i).tiempoUtilidad+"\t");
        System.out.print(trabajadores.get(i).utilidad+"\n");
    }
    
   }
   
   
   
}
