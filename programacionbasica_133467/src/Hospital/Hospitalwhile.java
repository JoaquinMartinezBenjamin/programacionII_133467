/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author Benjamín Joaquín Martínez
 */

import java.util.Scanner;
public class Hospitalwhile {
    
    
    public double montoPresupuestal;
    public String [] area;
    public double [] porcentaje; 
    public double [] montoPorArea; 
    
  Hospitalwhile() {
    area  = new String[] {"Pediatria","Traumatologia","Ginecologia"};
    porcentaje = new double[]{40,30,30};
    montoPresupuestal=0;
    montoPorArea = new double[]{0,0,0};
     } 
    
  
  public void setMontoPresupuestal (double montoPresupuestal){
  this.montoPresupuestal = montoPresupuestal;
  }
  
 
  
  public void leerMontoPresupuestal(){
  
   Scanner leer= new Scanner (System.in);
   System.out.println("Introduzca el monto presupuestal");
   setMontoPresupuestal(leer.nextDouble());
  }
  
  
  public void calcularPorcentajeArea(){
  int contador=0;
  String respuesta="";
  while(contador < area.length){
  
  montoPorArea[contador]= (montoPresupuestal/100) * porcentaje[contador];
  contador++;
  }
  }
  
  
  public void mostrarResultado ( ){
  
     int contador=0;
      while (contador<montoPorArea.length){
      System.out.println("El monto de "
                         +area[contador]+" es:\t"
                         +montoPorArea[contador]+"%");
      contador++;
      }
  
  
  }
  
  
  public static void main (String [] args){
  
  
 Hospitalwhile h = new Hospitalwhile ();
 h.leerMontoPresupuestal();
 h.calcularPorcentajeArea();
 h.mostrarResultado ();
  }
    
}
