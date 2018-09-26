package utilerias;

import modelos.Persona;

/**
 *
 * @author Javier Vázquez
 */
public class ProveedorComparaciones {

    public int compararPorNombre(Persona per1, Persona per2){
         return per1.getNombre().compareTo(per2.getNombre());
    }
    
    public int compararPorEdad(Persona per1, Persona per2){
        return per1.getEdad().compareTo(per2.getEdad());
    }
    
}
