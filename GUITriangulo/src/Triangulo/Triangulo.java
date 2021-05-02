/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulo;

/**
 *
 * @author Benjamin Joaquin Martinez
 */
import javax.swing.JOptionPane; 
public class Triangulo {
    double base;
    double altura;
    double area;
    
    public Triangulo(){
    base=altura=area=0;
    }
    
    public void pedirDatos(){
    
     base= 
      Double.parseDouble(
              JOptionPane.showInputDialog( "Introduzca la base del triangulo" )
      );
     
     altura= 
      Double.parseDouble(
      JOptionPane.showInputDialog( "Introduzca la altura del triangulo" )
      );


    }
    
    
    public double calcularArea(double base, double altura){
    
        return area=(base * altura )/2;
     
    }
    
    
    
    public void mostrarResultado(){
    
    
      JOptionPane.showMessageDialog( null, "El area del triangulo es " + area
              +" unidades cuadradas", 
         "Area resultante", JOptionPane.PLAIN_MESSAGE );
    }
    
    
    public double getBase(){return base;}
    public double getAltura(){return altura;}
    
    public static void main(String[] args) {
    Triangulo t = new Triangulo();
    t.pedirDatos();
    t.calcularArea(t.getBase(),t.getAltura());
    t.mostrarResultado();
     }
    
}
