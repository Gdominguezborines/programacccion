package ejherencia.ejherencia;

/**
 * @author cambes
 */
public class ejherencia {

    
    public static void main(String[] args) {
        
        
        taxi  obxtaxi = new taxi("aaa","123","audi",120);
        
     //de estas dos formas o en instancia
        autobus obxautobus =new autobus(22,"ss","sss",200);
        
     // o con metodo set dando valor para que lo devuelvan  los getter
        
      /*  obxautobus.setMatricula("aa");
        obxautobus.setModelo("pepe");
        obxautobus.setNunPlazas(23);
        obxautobus.setPotencia(222);
        */
        System.out.println("taxi= "+obxtaxi.toString());
        System.out.println("autobus= "+obxautobus.toString());
        
    }
    
}
