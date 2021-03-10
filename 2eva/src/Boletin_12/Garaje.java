package Boletin_12;

import javax.swing.JOptionPane;

/**
 * @author cambes
 */

public class Garaje {
    //tiempo coche dentro del garaje
    private float tiempo;
    //coche que entra en garaje    
    private Coches Coche;
    //cantidad de coches que estan en el garaje
    private static int cantidaCoches;
    //Cantidad maxima de coches que pueden estar en el garaje
    public static final int Completo=5;

    
    public Garaje() {
    }

    public Garaje(Boletin_12.Coches coche){
        Coche=coche;
    }
    
    
    public Garaje(float tiempo, Boletin_12.Coches coche) {
        this.tiempo = tiempo;
        Coche = coche;
    }

   
    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }
    
    public void setCoche(Boletin_12.Coches Coche) {
        this.Coche = Coche;
    }
    
    
    public static void setCantidaCoches(int cantidaCoches) {
        Garaje.cantidaCoches = cantidaCoches;
    }  
      
    
    
    public float getTiempo() {
        return tiempo;
    }

    public Boletin_12.Coches getCoche() {
        return Coche;
    }

    public static int getCantidaCoches() {
        return cantidaCoches;
    }

    @Override
    public String toString() {
        return "Garaje{" + "\ntiempo=  " + tiempo + " \n, Coche=  " + Coche + '}';
    }

 
    
    //Metodo para comprovar que hay sitio en el garaje
    
    public void comprovarSitio(Coches coche){
        if(cantidaCoches<=Completo) {
            JOptionPane.showMessageDialog(null,"plazas disponibles= "+(Completo-cantidaCoches));
        cantidaCoches++;
        JOptionPane.showMessageDialog(null,"Coche "+ Coche + "  ,entro en el garaje");
        
        }else
            
            JOptionPane.showMessageDialog(null," Garaje lleno");
                   
    }
    
    
    //Metodo que calcula el precio segun el tiempo que esta el coche dentro del garaje 
    
    
    public void calculaPrecioTiempo(){
        float tiempoCoche;
        float precioAparcar=0;
        
        
        if(cantidaCoches < Completo ){
           
            do{
                tiempoCoche=Float.parseFloat(JOptionPane.showInputDialog("Minutos que estuvo el coche aparcado"));
            
                if(tiempoCoche>0 && tiempoCoche<=180){
                    precioAparcar=1.5F;
                }else if (tiempoCoche > 180){
                    precioAparcar =((tiempoCoche -180)/60*0.20F+1.5F);
                 
                }else    
                      JOptionPane.showMessageDialog(null,"Datos incorrectos");
                
                }while (tiempoCoche<=0);
             float dinero=Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce dinero para pagar el estaccionamiento, el precio es de= "+Math.round(precioAparcar*100.0)/100.0+" E"));
            float vuelta =dinero-precioAparcar;
             
             JOptionPane.showMessageDialog(null,"Factura;\n "+
                    Coche 
                    +"\n tiempo total= "+tiempoCoche+" min \n"+ 
                    " Precio= "+Math.round(precioAparcar*100.0)/100.0+" E\n"
                    +" dinero ingresado= "+dinero+" E\n"
                    +" dinero devuelto= "+ Math.round(vuelta*100.0)/100.0+" E");
    
            
        } else 
            
            JOptionPane.showMessageDialog(null," Garaje completo" );
            
           // return precioAparcar;
            }
            

}
        
        
         

 
    
    
    
    
    
    
    

