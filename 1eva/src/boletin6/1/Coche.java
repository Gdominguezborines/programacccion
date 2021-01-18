/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cambes
 */

package boletin6.1;
public class Coche {
    
         
private  int velocidade;


    public Coche(){
         velocidade =0 ;
           }
    
    
    public Coche(int V ){
        velocidade=V;
        
            }

    public int getVelocidade( ){
       return velocidade;
    }
            

    public void Acelerar(int A){
        velocidade=velocidade+A;
        System.out.println("Al acelerar la velocidad es de= "+velocidade+"km/h");
               }

    public void Frenar(int F){
        velocidade=velocidade-F;
        
        System.out.println("Al frenar la velocidad es de ="+velocidade+"km/h");
                   }
    
    
    
    
    
    
}
