/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author cambes
 */
public class Felino  extends Mamifero implements IPodeNAdar{
    
    @Override
    public void podeNadar(){
        System.out.println("Pode nadar");
    }
    
    
}
