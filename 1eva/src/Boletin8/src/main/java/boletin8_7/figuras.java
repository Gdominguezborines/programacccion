/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin8_7;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class figuras {
    
    public void areaTriangulo(){
        float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la medida de la base"));
        float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la medida de la altura"));
        JOptionPane.showInternalMessageDialog(null,"El area es= "+(base*altura)/2);
    
    }
    public void areaCuadrado(){
        float lado =Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado"));
        JOptionPane.showInternalMessageDialog(null,"El area es= "+Math.pow(lado,2));
    }
    public void areaCirculo() {
        float radio=Float.parseFloat(JOptionPane.showInputDialog("Intruduce radio"));
        JOptionPane.showInternalMessageDialog(null,"El area es= "+Math.PI*Math.pow(radio,2));
    }
    
}
