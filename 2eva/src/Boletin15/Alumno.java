package boletin15;

/**
 *
 * @author Cambes
 */
public class Alumno {
    
    String nombre;
    int nota;
    int dni;

    public Alumno() {
    }

    public Alumno(String nombre, int nota, int dni) {
        this.nombre = nombre;
        this.nota = nota;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", nota=" + nota + ", dni=" + dni;
    }

    
    
    
}
