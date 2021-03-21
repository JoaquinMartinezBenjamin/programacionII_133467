/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

/**
 *
 * @author Benjamin Joaquin Martinez
 */
public class Articulo {
    public String    nombre;
    public String    clave; 
    public double    precioOriginal; 
    
    
    public Articulo [] articulos ;
    
    Articulo( Articulo [] a){
    
        setArticulos (a);
    }
    
    Articulo ( String nombre, String clave, double precioOriginal) {
        this.nombre=nombre;
        this.clave =clave;
        this.precioOriginal= precioOriginal;
      }
    
    public void setArticulos(Articulo [] a){
    this.articulos = a;
    }
    
    public Articulo[] getArticulos(){
    return articulos;
    }
    
    public void imprimirArticulos(){
    System.out.println("Nombre\tPrecio\tClave\tPrecio con descuento");
    int contador=0;
    while (contador < getArticulos().length){
        
        System.out.print(getArticulos()[contador].nombre+"\t");
        System.out.print("$"+getArticulos()[contador].precioOriginal+"\t");
        System.out.print(getArticulos()[contador].clave+"\t");
        
        if (getArticulos()[contador].clave=="01"){
        System.out.print(
                             getArticulos()[contador].precioOriginal -
                ((getArticulos()[contador].precioOriginal / 100) * 10)
        
        );}
        
         if (getArticulos()[contador].clave=="02"){
        System.out.print(
                             getArticulos()[contador].precioOriginal -
                ((getArticulos()[contador].precioOriginal / 100) * 20)
        
        );}
        
        System.out.println();
    contador++;
    }
    }
    
    
    public static void main (String [] args){
    
    Articulo articulo1 = new Articulo  ("Camisa","02",100);
    Articulo articulo2  = new Articulo ("Playera","01",150);
    Articulo articulo3  = new Articulo ("Sueter","02",200);
    Articulo articulo4  = new Articulo ("Blusa","01",250);
    
    Articulo [] misArticulos;
    misArticulos= new Articulo[]{articulo1,
                                 articulo2,
                                 articulo3,
                                 articulo4};
    
    Articulo inventario = new Articulo(misArticulos);
    
    
    inventario.imprimirArticulos();
    }
    
}
