 
package Boletin18;

/**
 * @author cambes
 */
public class Correo {
   private String contenido;
    Correo correo;
    boolean correoLeido;

    public Correo() {
    }

    public Correo(String contenido, Correo correo) {
        this.contenido = contenido;
        this.correo = correo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Correo getCorreo() {
        return correo;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }

    public boolean getCorreoLeido() {
        return correoLeido;
    }

    public void setCorreoLeido(boolean CorreoLeido) {
        this.correoLeido = CorreoLeido;
    }

    @Override
    public String toString() {
        return "Correo{" + "contenido=" + contenido + ", correo=" + correo + ", CorreoLeido=" + correoLeido + '}';
    }
    
} 