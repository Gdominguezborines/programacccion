package boletin13;

/**
 *
 * @author cambes
 */
public class PapaGallo extends Aves implements IPodeVolar{
    
    @Override
    public void podeVolar(){
        System.out.println("Pode volar");
    }
    
    public void amosar(){
        System.out.println("Esto es un Papagallo"); 
    }
    
}
