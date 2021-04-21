package com.gabriel;

import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 * @author cambes
 */
public class Componentes {
    
 
    
    JFrame marco;
    JPanel panelSuperior;
    JButton bLimpiar, bPremer;
    JTextField campoNome,campoPassw;
    JLabel etiNome,etiPassw;
   
    JPanel panelInferior;
    JList area;
    JTextArea areaTexto;
    JButton boton;
    String[] elementos={"ElementoLista1","   ","ElementoLista2","  ","ElementoLista3"};
    Border borde; 
    
public void iniciar (){
    //instanciamos los componentes
    
       marco= new JFrame("Boletin20");
       panelSuperior = new JPanel();
       bPremer = new JButton("Premer");
       bLimpiar = new JButton("Limpar");
       campoNome = new JTextField();
       campoPassw = new JTextField();
       etiNome= new JLabel("NOME:");
       etiPassw = new JLabel("Password:");
       
       panelInferior = new JPanel();
       area= new JList(elementos);
       boton = new JButton("Boton");
       areaTexto = new JTextArea("Area texto");
       borde= BorderFactory.createLineBorder(BLACK);
     
//cualidades del marco  
       
      
       marco.setSize(900,900);
       marco.setLocationRelativeTo(null);
       marco.setVisible(true);
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     //cualidades del panel
      
       panelSuperior.setSize(700,400);
       panelSuperior.setLayout(null);  //anulamos el layaut por defecto del panel
     
       panelInferior.setSize(700,400);
       panelInferior.setLayout(null);  //anulamos el layaut por defecto del panel
     
        
     //Cualidades de los botones
       
       bLimpiar.setBackground(Color.red);
       bLimpiar.setBounds(450,250,150,50);
       bLimpiar.setToolTipText("Elimina el texto");
       bLimpiar.setVerticalAlignment(1);
       bLimpiar.setHorizontalAlignment(2);
      
       bPremer.setBounds(200,250,150,50);
       bPremer.setBackground(Color.WHITE);
       bPremer.setVerticalAlignment(1);
       bPremer.setHorizontalAlignment(2);
      
       boton.setBounds(350,450,100,50);
       boton.setBackground(BLUE);
       
     //cualidades de las etiquetas
     
       etiNome.setBounds(150,-20,50,150);
       etiPassw.setBounds(150,50,80,150);
       
       //Lineas de texto
       
       campoNome.setBounds(340,35,250,50);
       campoPassw.setBounds(340,100,250,50);
              
       //Area del texto
       
       areaTexto.setBackground(Color.GREEN);
       areaTexto.setBounds(550,430,130,150);
       areaTexto.setBorder(borde);
       area.setBounds(150,400,150,200);
       area.setBorder(borde);
       //engadimos compoñente
       
       marco.add(panelSuperior);
       
       panelSuperior.add(etiNome);
       panelSuperior.add(etiPassw);
       panelSuperior.add(campoNome);
       panelSuperior.add(campoPassw);
       panelSuperior.add(bPremer);
       panelSuperior.add(bLimpiar);
      
       marco.add(panelInferior);
       
       panelInferior.add(areaTexto);
       panelInferior.add(area);
       panelInferior.add(boton);
       
  
}    
    
}