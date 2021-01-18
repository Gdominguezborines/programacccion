/*
2- A seguinte clase ten problemas de compilación . Corríxeos e ,de seguido, implementa unha clase principal ( Boletin 6₂ ), co metodo main() para testear e verificar os métodos da clase Satelite.

public class Satelite ( )   {
 
     private double meridiano ;
     private double paralelo
     private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0
}

public Satelite ( double m; double p ; double d ) ; {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println (“ o satelite atopase  no paralelo “ paralelo + “meridiano ” + meridiano “ a unha distancia da terra “ +“ distanciaTerra )     

*/

import java.util.Scanner;

/**
 *
 * @author cambes
 */
public class Boletin6_2 {

    public static void main(String[] args) {
        // TODO code application logic here
   
    
      Scanner sc =new Scanner(System.in);
    
    System.out.println("Escribe la distancia meridiano= ");
         int M=sc.nextInt();
         
    System.out.println("Escribe la distancia paralelo= ");
         int P=sc.nextInt();
    
         System.out.println("Escribe la distancia tierra= ");
         int T=sc.nextInt();
     
         Satelite distancia =new Satelite(M, P, T);
     
     
      distancia.verPosicion();

    
    
    
    
    
    }
    
}
