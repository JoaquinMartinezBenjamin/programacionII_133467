/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Votos;

/**
 *
 * @author benja
 */
public class Votos {
    
    public int candidato1;
    public int candidato2;
    public int candidato3;
    int voto=0;
    
    public void leerVotos() {
    for(int i=0; i<250000;i++){
    
    voto = (int)(Math. random()*3+1);
    if(voto==1) candidato1++;
    if(voto==2) candidato2++;
    if(voto==3) candidato3++;
    }
    
    }
    
    
    public void obtenerGanador(){
    
    int ganador= candidato1;
    String numero="1";
    
    if(candidato2>ganador) {ganador=candidato2; numero="2";}
    if(candidato3>ganador) {ganador=candidato3; numero="3";}
    
    
    
    System.out.println("El ganador fue el candidato"+numero);
    System.out.println("con un total de "+ganador+" votos");
}


    public static void main (String [] args){
    
    Votos v = new Votos();
    v.leerVotos();
    v.obtenerGanador();
    
    }
    
}