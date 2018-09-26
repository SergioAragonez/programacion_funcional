package accept_estudiantes;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Javier Vázquez
 */
public class OperacionEstudiantes {
    
    public void aceptaTodos(List<Estudiante> estudiantes, 
            Consumer<Estudiante> cons){
    
        for (Estudiante estudiante : estudiantes) {
            cons.accept(estudiante);
        }
    }
    
}
