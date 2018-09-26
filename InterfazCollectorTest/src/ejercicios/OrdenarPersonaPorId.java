package ejercicios;

import java.util.Comparator;
import modelos.Persona;

/**
 *
 * @author Javier Vázquez
 */
public class OrdenarPersonaPorId implements Comparator<Persona>{
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getIdPersona() - o2.getIdPersona();
        //ssdfs
    }
}
