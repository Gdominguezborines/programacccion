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
public class Comprovacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int Numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe el numero que quieres comprovar"));

        Formulas numero = new Formulas(Numero);

        numero.ComprovacionNumeroPositivo();


    }

}
