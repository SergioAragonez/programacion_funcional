package operaciones_reduccion;

import datos.Empleado;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Javier Vázquez
 */
public class OperacionesReduccion1 {
    public static void main(String[] args) {
        
        
        //Suma de elementos
       /*int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        System.out.println("La suma es: " + suma);
        
        //Promedio
        double promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);
        
        //cuenta de elementos
        System.out.println("Cantidad de elementos: " + numeros.length);
        
        //Obtener el máximo
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("El máximo es: " + maximo);
        
        //Obtener el mínimo
        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("El mínimo es: " + minimo);
        
        System.out.println("\n");
        System.out.println("Operaciones de reducción con empleados");*/
        
        //suma de salarios
        /*double sumaSalarios = 0.0;
        
        for (Empleado empleado : empleados) {
            sumaSalarios += empleado.getIngresos();
        }
        
        System.out.println("La suma de los salarios es: " + 
                sumaSalarios);
        
        //Cantidad de empleados
        System.out.println("La cantidad de empleados es: " + 
                empleados.size());
        
        //Obtener empleado con salario máximo.
        Empleado empMaximo = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getIngresos() > empMaximo.getIngresos()) {
                empMaximo = empleado;
            }
        }
        System.out.println("Empleado máximo salario: " + 
                empMaximo.getNombre() + " " + empMaximo.getIngresos());*/
        
        int [] numeros = { 4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 
            8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99 };
        
        List<Empleado> empleados = Empleado.empleados();
        
        //Operaciones de reducción con números
        
        //suma de los elementos
        System.out.println("La suma es: " + 
                IntStream.of(numeros).sum());
        
        //Obtener promedio de los elemtos
        System.out.println("El promedio es: " + 
                IntStream.of(numeros).average().getAsDouble());
        
        //obtener mínimo y máximo
        System.out.println("El valor máximo es: " + 
                IntStream.of(numeros).max().getAsInt());
        
        System.out.println("El valor mínimo es: " + 
                IntStream.of(numeros).min().getAsInt());
        
        //contar cantidad de elementos
        System.out.println("Cantidad de elemntos: " + 
                IntStream.of(numeros).count());
        
        
        //Operaciones con empleados
        //sumar los salarios de todos los empleados.
        System.out.println("\nOperaciones con empleados y streams");
        
        System.out.println("Suma de salarios: " + 
                empleados
                     .stream()
                     .mapToDouble(Empleado::getIngresos)
                     .sum());
        
        //Obtener el empleado con el salario máximo
        Empleado empMax = empleados
                .stream()
                .max(
                    (emp1, emp2) -> 
                         (int)(emp1.getIngresos() - emp2.getIngresos()))
                .get();
        
        System.out.println("Empleado máximo salario " + 
                empMax.getNombre()+": "+empMax.getIngresos());
                
    }
}
