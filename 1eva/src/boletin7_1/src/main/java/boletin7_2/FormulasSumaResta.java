package boletin7_2;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * Implementa un programa no que se tecleen dous números de tipo short.
 * Se o primeiro é maior ou igual que o segundo,visualizaremos a resta.
 * En calquera caso visualizaremos a suma
 */
public class FormulasSumaResta {

    /**
     * declaro las variables
     */

    private short num1, num2;


    /**
     * creo constructor pòr defecto y parametrizado
     */
    public FormulasSumaResta() {
    }

    public FormulasSumaResta(short num1, short num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    /**
     * creo el metodo mcon JOptionpane
     */

    public void ComprovarNumero() {
        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "La resta del numero " + num1 + " menos " + num2 + " es igual a " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "La suma del numero " + num1 + " mas " + num2 + " es igual a " + (num1 + num2));
        } else
            JOptionPane.showMessageDialog(null, "La suma del numero " + num1 + " mas " + num2 + " es igual a " + (num1 + num2));
    }


}
