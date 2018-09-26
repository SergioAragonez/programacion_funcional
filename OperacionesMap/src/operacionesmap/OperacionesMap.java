package operacionesmap;

import datos.Empleado;
import java.util.List;

/**
 *
 * @author Javier Vázquez
 */
public class OperacionesMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*IntStream.rangeClosed(1, 5)
                .map(new IntUnaryOperator(){
                    @Override
                    public int applyAsInt(int numero) {
                        return numero * numero;
                    }
                })
                .forEach(System.out::println);
        
        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);*/
        
        List<Empleado> empleados = Empleado.empleados();
        
        /*System.out.println("Promedio de ingresos de personal femenino mayor de 25 años");
        double suma = empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .map(emp -> emp.getIngresos())
                .sum();
        
        double promedio = suma / empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .count();*/
        
        empleados.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre()));
        
    }
    
}
