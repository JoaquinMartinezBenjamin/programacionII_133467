/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegiatura;

/**
 *
 * @author Benjamin Joaquin Martinez
 */
import java.util.Scanner;

public class Colegiatura {
    
    public int numeroMaterias;
    public double costoMaterias;
    public String idAlumno;
    public double promedioAlumno;
    public double costoColegiatura;
    
    
    public Colegiatura(double costoMaterias,String idAlumno,
            int numeroMaterias,double promedioAlumno){
   
        this.costoMaterias=costoMaterias;
        this.idAlumno = idAlumno;
        this.numeroMaterias= numeroMaterias;
        this.promedioAlumno=promedioAlumno;
    
    }

    Colegiatura(){}
    
    public double calcularColegiatura () {
        
        double iva=0;
        double descuento=0;
        if(promedioAlumno >= 9 ){
        descuento = ((costoMaterias * numeroMaterias)/100) * 30;
        costoColegiatura = (costoMaterias * numeroMaterias) - descuento;
        } else{
        
        iva= ((costoMaterias * numeroMaterias)/100) * 10;
       costoColegiatura = (costoMaterias * numeroMaterias) + iva;
        }
        return costoColegiatura;
    }
    
     String   getID(){ return idAlumno;}
        
       public void imprimirDatos(){
       
           System.out.print("El alumno "+idAlumno);
           System.out.print(" debera pagar una colegiatura de  ");
           System.out.print(costoColegiatura+ " pesos\n");
           
       }
        
        
       
       public static void main (String [] args){
       

      Scanner leer= new Scanner (System.in);
      Colegiatura c= new Colegiatura();
      
      System.out.println("Introduzca el costo por materia");
      double costoMaterias=leer.nextDouble();
      
      System.out.println("Introduzca el numero de Alumnos");
      double numeroAlumnos=leer.nextInt();
      
      //**********************************************//
      
      int contador=0;
      while  (contador<numeroAlumnos){
      
                System.out.println("\nIntroduzca el nombre del alumno"+(contador+1));
      String idAlumno=leer.next();
       
       
      System.out.println("Introduzca el numero de materias del alumno"+(contador+1));
      int numeroMaterias=leer.nextInt();
      
  
      System.out.println("Introduzca el promedio del alumno"+(contador+1));
      double promedioAlumno=leer.nextDouble();
      
      c = new Colegiatura(costoMaterias,idAlumno, numeroMaterias,promedioAlumno);
      c.calcularColegiatura();
     
      
          System.out.print("El alumno "+c.getID());
           System.out.print(" debera pagar una colegiatura de  ");
           System.out.print(c.calcularColegiatura()+" pesos\n");
      
      contador++;
      }
      
      
 }
       
       
    } 
    
