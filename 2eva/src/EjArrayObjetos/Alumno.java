
package EjArrayObjetos;

/**
 * @author cambes
 */
public class Alumno {
   
   private String nome;
   private int nota;
   private  String dni;

    public Alumno() {
    }

    public Alumno(String nome, int nota, String dni) {
        this.nome = nome;
        this.nota = nota;
        this.dni = dni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "nombre "+nome+" nota "+nota+" dni "+dni;
    }
    
  
   
   
   
   
}
