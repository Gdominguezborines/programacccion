
package Boletin14;

/**
 * @author cambes
 */
public class ConversorTemperaturas {
    
   public static final float TemperatutaMinima=80F;        

    public ConversorTemperaturas() {
    }
    
   
/**conversion de centigrados a farenheit y con throws le indico que la excepccion
 * no va a ser capturada aqui sino pasada a try catch
 * @throws TemperaturaErradaExcepcion 
 */
   
      public float centigrAFarenh(float TempCenti)throws TemperaturaErradaExcepcion{
       
       if(TempCenti<TemperatutaMinima){
               throw new TemperaturaErradaExcepcion("La temperatura tiene que ser mayor de 80º");// creo el mensaje que trasladare a mi excepccion 
              
          }else{
         
       //busque en google y es +32 no +32,4 par apasar a faranheit   (TempCenti*9/5)+32= a temperatura deseada
           return(TempCenti*1.8F)+32F;
   }
   }
      
      public void centiAReamur(float gradosCels){
          
          try{ //En este metodo se captura la excepccion por que asi lo dice en el boletin
              float TempRamur=gradosCels*0.8F;
              
              if(gradosCels<TemperatutaMinima){
                  throw new TemperaturaErradaExcepcion("La temperatura tiene que ser mayor a 80º");// si salta la excepccion mostrara el mensaje
                  }
              
              System.out.println("La Temperetura en grados celsius es de= "+gradosCels+"ºC en Reamur es de "+TempRamur);
          
              }catch (TemperaturaErradaExcepcion e){ // si saltara la excepccion se crea un nuebo objeto llamado e que usare abajo para:
                  
                    System.out.println(e.getMessage());//imprimir el mensaje que cree en la excepccion
          }                   
                 
              
          }          
      }
      