package main;

import datos.Empleado;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author Javier Vázquez
 */
public class OpReduccion1 {

    public static void main(String[] args) {
        /*List<String> nombres = Empleado.empleados()
                         .stream()
                         .map(Empleado::getNombre)
                         .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        
        
        System.out.println(nombres);*/
        
        /*Set<String> nombres = Empleado.empleados()
                         .stream()
                         .map(Empleado::getNombre)
                         .collect(Collectors.toSet());
        
        
        System.out.println(nombres);*/
        
        SortedSet<String> nombres = Empleado.empleados()
                         .stream()
                         .map(Empleado::getNombre)
                         .collect(Collectors.toCollection(TreeSet::new));
        
        
        System.out.println(nombres);
        
        
    }
    
}
