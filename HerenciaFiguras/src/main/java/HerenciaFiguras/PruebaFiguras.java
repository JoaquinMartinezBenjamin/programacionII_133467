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
import java.util.*;
public class PruebaFiguras {
  public static void main(String args[]){
    Scanner leer=new Scanner (System.in);
    Rectangulo R1=new Rectangulo();
    PrismaRec PR=new PrismaRec();
    PiramideRec PIR = new PiramideRec();
    
    
    Triangulo T = new Triangulo(); 
    PrismaTri  PT = new PrismaTri();
    PiramideTri PIT = new PiramideTri();
    
    
    Circulo C = new Circulo (); 
    Cilindro Cil = new Cilindro();
    Cono Con = new Cono ();
    Esfera Esf = new Esfera ();
    
    //Figura f=new Figura(); Error. Una clase abstracta no puede instanciarse
    int opc=1;
    
    do{
       System.out.println("\n 1. Rectangulo"
               + "\n 2. Prisma Rectangular "
               + "\n 3. Piramide Rectangular "
               + "\n 4. Triangulo "
               + "\n 5. PrismaTriangular "
               + "\n 6. PiramideTriangular "
               + "\n 7. Circulo "
               + "\n 8. Cilindro "
               + "\n 9. Cono "
               + "\n 10. Esfera "
               
                + "\n 0. Salir "
               
               
               
               + "\n Opcion=>");
       opc=leer.nextInt();
       switch(opc){
           case 1: R1.pedir_datos();
               R1.calc_area();
               R1.calc_perim();
               break;
               
           case 2: PR.pedir_datos();
                  PR.calc_vol();
               break;
               
               
             case 3: PIR.pedir_datos();
               PIR.calc_vol();
               break;   
              
               
              case 4: T.pedir_datos();
               T.calc_area();
               T.calc_perim();
               break;
               
               
               
              case 5: PT.pedir_datos();
                PT.calc_vol();
               break;
               
               
               case 6: PIT.pedir_datos();
                PIT.calc_vol();
               break;
               
               
                case 7: C.pedir_datos();
               C.calc_area();
               C.calc_perim();
               break;
               
               
               case 8: Cil.pedir_datos();
                Cil.calc_vol();
               break;
               
               case 9: Con.pedir_datos();
                Con.calc_vol();
               break;
               
               
               case 10: 
                Esf.calc_vol();
               break;
               
           
       }
    }while(opc>0);
    
  }  
}

