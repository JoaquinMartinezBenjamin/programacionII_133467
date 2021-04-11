/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

/**
 *
 * @author Benjamin Joaquin Martinez 
 * Matricula : 133467
 */
import java.util.*;
public class Conversion {
 int Convierte[];  
 int pos;
 Conversion()
 {
   Convierte=new int[50];
   pos=50;
 }
    int binario(int cos)
    {
      int res;
     
      if(cos!=0)
      {
        res=cos%2;
        
        pos--;
        Convierte[pos]=res;
        return binario(cos/2);
      }
      else
          return 0;
    }
    
    
    int octal(int cos)
    {
      int res;
     
      if(cos!=0)
      {
        res=cos%8;
        
        pos--;
        Convierte[pos]=res;
        return octal(cos/8);
      }
      else
          return 0;
    }
    
    
      int hexadecimal(int cos)
    {
      int res;
     
      if(cos!=0)
      {
        res=cos%16;
        
        pos--;
        Convierte[pos]=res;
        return hexadecimal(cos/16);
      }
      else
          return 0;
    }
    
    
    
    void muestraConversion()
    {
      for(int x=pos;x<=49;x++){
    if( Convierte[x]==15){ System.out.print("F");}else{
      if( Convierte[x]==14){ System.out.print("E");}else{
        if( Convierte[x]==13){ System.out.print("D");}else{
           if( Convierte[x]==12){ System.out.print("C");}else{
              if( Convierte[x]==11){ System.out.print("B");}else{
                  if( Convierte[x]==10){ System.out.print("A");}else{
                                         System.out.print(Convierte[x]);
                                                                   }
                                                                }
                                                            }
                                                         }
                                                       }
                                                      }
                              }
    }
    
    
    public void reset(){
     for(int i=0; i<Convierte.length; i++) Convierte[i]=0;
      pos=50;
    }
    
    
    public static void main(String args[])
{
    Scanner leer=new Scanner(System.in);
    int num=-1;
   Conversion c=new Conversion();
   int selector=-1;
   
    do{
        c.reset();
  System.out.println("\nElija una opcion");
    System.out.println("1 = Binario");
      System.out.println("2 = Octal");
        System.out.println("3 = Hexadecimal");
        System.out.println("0 = Finalizar programa\n Opcion-->");
        
  selector=leer.nextInt();
  
  switch (selector){
      
      case 1:
          System.out.println("Numero--> ");
           num=leer.nextInt();
            c.binario(num);
            c.muestraConversion();
          break;
          
            case 2:
          System.out.println("Numero--> ");
           num=leer.nextInt();
            c.octal(num);
            c.muestraConversion();
          break;
          
            case 3:
          System.out.println("Numero--> ");
           num=leer.nextInt();
            c.hexadecimal(num);
            c.muestraConversion();
          break;
  
  }

    }while(selector!=0);
  
}
}