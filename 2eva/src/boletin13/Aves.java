package boletin13;

/**
 *
 * @author cambes
 */
public class Aves extends Animales implements  IPodeCaminar{
    
    @Override
    public void podeCaminar(){
        
        System.out.println("Pode caminar ");
    }
    
}
