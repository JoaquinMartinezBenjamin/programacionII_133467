/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosobjetos;

/**
 *
 * @author benja
 */


import java.util.*;

public class Cine {
        public static void main(String args[]){
      Scanner leer=new Scanner (System.in);
      
      int opc,e;
      String n,t;
      int id;
      Cartelera cart=new Cartelera();
      do{
          System.out.println("\n_______________________________\n");
        System.out.println("\n 1. Agregar pelicula");
        System.out.println("\n 2. Buscar pelicula");
        System.out.println("\n 3. Listar peliculas");
        System.out.println("\n 4. Salir \n --- > ");
        opc=leer.nextInt();
        switch (opc){      //Line() para leer cadena con espacios
                           //porque next solo lee una palabra
            
            case 1:
                    leer.nextLine(); // para limpiar el scanner despues de leer numeros
                System.out.print("Nombre: ");
                    n=leer.nextLine();
                     System.out.print("\n");
                     
                     System.out.print("Genero: ");
                    t=leer.nextLine();
                       System.out.print("\n");
                    
                    System.out.print("Anio: ");
                    e=leer.nextInt();
                       System.out.print("\n");
                  
                   
                            
                    cart.GuardarPelicula(n, t, e);
                break;
            case 2:System.out.println("ID:");
                    id=leer.nextInt();
                  cart.Buscar(id);
                break;
            case 3: cart.listar();
                   break;
        }
      }while(opc<4);
      
    }

    
}
