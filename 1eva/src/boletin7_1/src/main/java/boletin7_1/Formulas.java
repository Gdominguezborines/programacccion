/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * codifica un programa que saque, por consola, un número tecleado,
 * sempre que sexa positivo,xunto coa mensaxe “ e positivo “
 */
public class Formulas {
    /**
     * creo variable numero que sera la que pase por pantalla
     */

    public int numero;


    /**
     * creo constructor por defecto y constructor parametrizado para dar valor a variable numero
     */

    public Formulas() {
    }


    public Formulas(int num1) {
        numero = (num1);
    }

    /**
     * ya que usamos el metodo JOptionPane y el ejercicio no pide nada mas solo  creo el JOptionPane
     * <p>
     * creo el metodo para saber si la variable es positiva
     */

    public void ComprovacionNumeroPositivo() {
        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "EL numero que as puesto es " + numero + "es positivo");

            JOptionPane.showMessageDialog(null, "Vuelve a ejecutar para volver a comprovar tu numero");
        }
     /*   else{
            JOptionPane.showMessageDialog(null,"El numero es negativo ");
            JOptionPane.showMessageDialog(null,"Vuelve a ejecutar para volver a comprovar tu numero");
        
        }*/

    }


}
