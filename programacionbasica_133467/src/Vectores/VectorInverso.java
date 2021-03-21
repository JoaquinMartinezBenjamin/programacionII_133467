/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectores;

/**
 *
 * @author benja
 */
public class VectorInverso {
    
    int vector[]=new int [150];
     int vectorInverso[]=new int [150];
    
    public void llenarVector(){
        for(int i=0; i<150;i++){
    vector[i]=(int)(Math. random()*100+1);
        }
    }
    
    public void invertirVector(){
         
            int contador=0;
            for(int i=149; i>=0;i--){
            vectorInverso[contador]= vector[i];
            contador++;
            
            }
            
    }
    
    
    public void mostraResultados(){
        
         System.out.println("vector original");
         System.out.println(); 
    for(int i=0; i<150;i++){
    
    System.out.print(vector[i]+"\t");
    if(i%10==0)System.out.println(); //para formato
    }
    System.out.println(); 
      System.out.println("vector inverso");
    for(int i=0; i<150;i++){
    
   System.out.print(vectorInverso[i]+"\t");
    if(i%10==0)System.out.println(); //para formato
    }
    System.out.println(); 
    
    }
    
    
    public static void main (String [] args){
    VectorInverso v = new VectorInverso();
    v.llenarVector();
    v.invertirVector();
    v.mostraResultados();
    }
    
}
