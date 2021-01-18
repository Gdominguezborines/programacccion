package boletin7_2;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * Implementa un programa no que se tecleen dous números de tipo short.
 * Se o primeiro é maior ou igual que o segundo,visualizaremos a resta.
 * En calquera caso visualizaremos a suma
 */
public class ConsultaSumaResta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Desde aqui llamamos al metodo  con JOptionpane

        short num1 = Short.parseShort(JOptionPane.showInputDialog("escribe el primer numero"));
        Short num2 = Short.parseShort(JOptionPane.showInputDialog("Escribe el segundo numero"));


        // instancio  mi objeto (numero)

        FormulasSumaResta numero = new FormulasSumaResta(num1, num2);

        numero.ComprovarNumero();

    }

}
