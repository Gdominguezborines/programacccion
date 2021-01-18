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
public class MaiorQue {
    /**
     * Declaro variables num1,num2,num3
     */    
    private int num1,num2,num3;

    /**
     * Creo constructor por defecto y constructor parametrizado
     */
    public MaiorQue() {
    }

    public MaiorQue(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    
    public void maior(){
        if (num1>num2 && num1>num3){
            JOptionPane.showMessageDialog(null,"El numero "+num1+" es maior que el numero "+num2+ " y "+num3);
        }
        else if (num2>num1 && num2>num3){
            JOptionPane.showMessageDialog(null,"El numero "+num2+" es maior que el numero "+num1+ " y "+num3);
        }
       else
            JOptionPane.showMessageDialog(null,"El numero "+num3+" es maior que el numero "+num1+ " y "+num2);  
            
    } 
}
