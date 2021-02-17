package Boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author cambes
 */
public class validaDni {
    public void validaDNI(){
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int entrada=Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese los numeros del DNI sin puntos y sin la letra final","Inserta dni"));
                     
        int resto = entrada%23;
       JOptionPane.showMessageDialog(null,"El DNI completo es :"+entrada+String.valueOf(letra[resto]));
    }
  
}
