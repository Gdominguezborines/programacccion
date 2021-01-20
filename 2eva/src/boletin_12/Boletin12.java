package boletin_12;


/**
 * @author cambes
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Coches coche1 = new Coches("po7000bn");
        Garaje cliente1 = new Garaje(coche1);
        cliente1.comprovarSitio(coche1);
        cliente1.calculaPrecioTiempo();
        
        Coches coche2 = new Coches("3652asd");
        Garaje cliente2 = new Garaje(coche2);
        cliente2.comprovarSitio(coche2);
        cliente2.calculaPrecioTiempo();
        
        Coches coche3 = new Coches("ln3456l");
        Garaje Cliente3 = new Garaje(coche3);
        Cliente3.comprovarSitio(coche3);
        Cliente3.calculaPrecioTiempo();
                
        Coches coche4 = new Coches("ytr5678");
        Garaje cliente4 = new Garaje(coche4);
        cliente4.comprovarSitio(coche4);
        cliente4.calculaPrecioTiempo();
        
        Coches coche5 = new Coches("yth5678");
        Garaje cliente5 = new Garaje(coche5);
        cliente5.comprovarSitio(coche5);
        cliente5.calculaPrecioTiempo();
        
        
        Coches coche6 = new Coches("mmg4567");
        Garaje cliente6 = new Garaje (coche6);
        cliente6.comprovarSitio(coche6);
        cliente6.calculaPrecioTiempo();
        
        
        
        
    }
    
}
