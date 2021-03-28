/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizDiagonal;

/**
 *
 * @author Benjamin Joaquin Martinez 
 */
public class Diagonal {
   
    
     public int matriz[][];
     
     public Diagonal(){
     matriz = new int [10][10];
     
     }
    
     
     public void llenarMatriz (){
     
     for(int i=0; i<10; i++){
     for(int j=0; j<10; j++){
         
         if(i==j){ matriz[i][j]=1;}
         else{matriz[i][j]=0;}
     }
     
     }
     
     }
     
     public void imprimirMatriz(){
      for(int i=0; i<10; i++){
     for(int j=0; j<10; j++){
         
        System.out.print(matriz[i][j]+"\t");
     }
     System.out.println();
     }
     }
     
     
     
     public static void main (String [] args){
     
     Diagonal d = new Diagonal();
     d.llenarMatriz();
     d.imprimirMatriz();
     }
     
     }
    
    

