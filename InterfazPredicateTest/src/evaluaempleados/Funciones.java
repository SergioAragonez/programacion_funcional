package evaluaempleados;

import java.util.function.BiFunction;

/**
 *
 * @author Javier Vázquez
 */
public class Funciones {
    public Double incrementoSalario(Empleado emp, double incremento,
            BiFunction<Double, Double, Double> bi){
    
        return bi.apply(emp.getSalario(), incremento);
    }
}
