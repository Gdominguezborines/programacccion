package com.gabriel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author cambes
 */
public class Componentes {
    
 
    
    JFrame marco;
    JPanel panel;
    JButton bLimpiar, bPremer;
    JTextField campoNome,campoPassw;
    JLabel etiNome,etiPassw;
    JTextArea areaTexto;

   
     
public void iniciar (){
    //instanciamos los componentes
    
       marco= new JFrame("Boletin19");
       panel = new JPanel();
       bPremer = new JButton("Premer");
       bLimpiar = new JButton("Limpar");
       campoNome = new JTextField();
       campoPassw = new JTextField();
       etiNome= new JLabel("NOME:");
       etiPassw = new JLabel("Password:");
       areaTexto = new JTextArea();
       
     //cualidades del marco  
      
       marco.setSize(800,600);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       marco.setSize(800,800);
       marco.setLocationRelativeTo(null);
       
     //cualidades del panel
      
       panel.setSize(750,750);
       panel.setLayout(null);  //anulamos el layaut por defecto del panel
     
     //Cualidades de los botones
       
       bLimpiar.setBackground(Color.red);
       bLimpiar.setBounds(450,450,150,50);
       bLimpiar.setToolTipText("Elimina el texto");
       bLimpiar.setVerticalAlignment(1);
       bLimpiar.setHorizontalAlignment(2);
      
       bPremer.setBounds(200,450,150,50);
       bPremer.setBackground(Color.WHITE);
       bPremer.setVerticalAlignment(1);
       bPremer.setHorizontalAlignment(2);
      
       
     //cualidades de las etiquetas
     
       etiNome.setBounds(150,-20,50,150);
       etiPassw.setBounds(150,50,80,150);
       
       //Lineas de texto
       
       campoNome.setBounds(340,35,250,50);
       campoPassw.setBounds(340,100,250,50);
              
       //Area del texto
       
       areaTexto.setBackground(Color.GREEN);
       areaTexto.setBounds(200,200,400,150);
        
       //engadimos compoñente
       
       panel.add(etiNome);
       panel.add(etiPassw);
       panel.add(campoNome);
       panel.add(campoPassw);
       panel.add(areaTexto);
       panel.add(bPremer);
       panel.add(bLimpiar);
      
       
       marco.add(panel);
       marco.setLocationRelativeTo(null);
       marco.setVisible(true);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
}    
    
}
    
