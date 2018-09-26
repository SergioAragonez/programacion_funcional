package accept_estudiantes;

/**
 *
 * @author Javier Vázquez
 */
public class Estudiante {

    private String nombre;
    private double calificacion;

    public Estudiante(String nom, double cal) {
        this.nombre = nom;
        this.calificacion = cal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
}
