/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Censo;


import java.util.ArrayList;

/**
 *
 * @author benja
 */
public class Censo {
    public int numeroDeCenso;
    public char sexo;
    public int edad;
    public String estadoCivil;
    ArrayList<Censo> censos = new ArrayList<Censo>();
    
    public Censo(){}
    
    public Censo(int numeroDeCenso, char sexo, int edad, String estadoCivil){
    
    
    this.numeroDeCenso= numeroDeCenso;
    this.sexo=sexo;
    this.edad= edad;
    this.estadoCivil=estadoCivil;
    }
    
    
    public void llenarCenso(){
    
    int numero=0;
    char sex='x';
    int edad=0;
    String estadoCivil="";
    for(int i=0; i<1000; i++){
    numero=(int)(Math. random()*2+1);
    if(numero==1) sex='H';
    if(numero==2) sex='M';
     edad=(int)(Math. random()*100+1);
     numero=(int)(Math. random()*4+1);
     
    if(numero==1) estadoCivil="Soltero";
    if(numero==2) estadoCivil="Casado";
    if(numero==3) estadoCivil="Viudo";
    if(numero==4) estadoCivil="Divorciado";
    
    censos.add(new Censo(i,sex,edad,estadoCivil));
    }
    }
    
    public void consulta(){
    
         System.out.println("no.censo\tsexo\tedo.civil\tedad");
        
     for (int i=0;i<censos.size();i++) {
  if( censos.get(i).sexo=='M' && 
      censos.get(i).estadoCivil=="Soltero" &&
        (censos.get(i).edad >=16 && censos.get(i).edad <=21 )  ){
  
  System.out.print(censos.get(i).numeroDeCenso+"\t");
  System.out.print(censos.get(i).sexo+"\t");
  System.out.print(censos.get(i).estadoCivil+"\t");
  System.out.print(censos.get(i).edad+"\t");
  System.out.print("\n");
  }
    }
    
}
    
    public static void main (String [] args){
    Censo c = new Censo();
    c.llenarCenso();
    c.consulta();
    }
}