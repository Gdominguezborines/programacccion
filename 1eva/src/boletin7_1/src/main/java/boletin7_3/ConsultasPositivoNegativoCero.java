package boletin7_3;

import javax.swing.JOptionPane;

/**
 * @author cambes
 * Teclear un número e sacar por consola o signo “ + “ se o nº é positivo,
 * o signo “ –“ se é negativo e “ 0 “ se é cero .
 */
public class ConsultasPositivoNegativoCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desde aqui hacemos llamada a metodos de positivoNegativoCero
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero a comprovar"));
        
        PositivoNegativoCero numero1 =new PositivoNegativoCero(numero);
        numero1.comprovar();
        
        
        
    }
    
}
