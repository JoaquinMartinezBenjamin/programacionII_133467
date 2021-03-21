/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VectoresMultiplicacion;

/**
 *
 * @author benja
 */
public class VectoresMultiplicacion {
    
    public int vectorA[];
    public int vectorB[];
    public int vectorC[];
    
    public VectoresMultiplicacion(int vectorA[],int vectorB[]){
    
    this.vectorA=vectorA;
    this.vectorB=vectorB;
    vectorC= new int[20];
   
    }
    
    
    
   public void multiplicarVectores() {
       int j=19;
   for(int i=0;i<20;i++){
   vectorC[i]= vectorA[i] * vectorB[j];
           j--;
           }
   } 
    
   
   public void imprimirVectores(){
     System.out.println("VectorA");
     for(int i=0;i<20;i++){
     
     System.out.print(vectorA[i]+"\t");
     }
     
      System.out.println();
      
        System.out.println("VectorB");
       for(int i=0;i<20;i++){
     
     System.out.print(vectorB[i]+"\t");
     }
     
      System.out.println();
      
        System.out.println("vectorC");
       for(int i=0;i<20;i++){
     
     System.out.print(vectorC[i]+"\t");
     }
     
      System.out.println();
     
   }
   
   
   
   public static void main (String [] args){
       
       int vectorA[]= new int[20];
       int vectorB[]= new int[20];
       int aux=0;
       for(int i=0; i<20; i++){
           aux= (int)(Math. random()*10+1);
           vectorA[i]=aux;
           aux= (int)(Math. random()*10+1);
           vectorB[i]=aux;
             }
            
       
   
   VectoresMultiplicacion misVectores = new VectoresMultiplicacion(vectorA,vectorB);
   misVectores.multiplicarVectores();
   misVectores.imprimirVectores();
   }
   
    
}
