/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class ComprovarMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desde aqui llamamos a los metodos de MaiorQue 
   
    
 
    
    int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
    int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
    int num3=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer numero"));
    
    MaiorQue numeros=new MaiorQue(num1,num2,num3);
    numeros.maior();
    
    
    
    }
    
}
