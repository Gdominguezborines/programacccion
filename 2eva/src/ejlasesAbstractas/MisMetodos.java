 
package ejlasesAbstractas;
   
import javax.swing.JOptionPane;

public class MisMetodos {

  public static float lerFloatPositivo(){
  float res;
  
  do{
      res=Float.parseFloat(JOptionPane.showInputDialog("teclea variable"));
  
  } while(res<=0);
       return res;
  }         
}