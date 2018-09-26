package ej_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Javier Vázquez
 */
public class CrearStream3 {
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);
        
        Stream<String> nombres = Arrays.stream(new String[]{"Juan", "Pedro", "Maria", "Esteban"});
        nombres.forEach(System.out::println);
        
        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("JAVA");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");
        
        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(System.out::println);
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Perez", 25, 25));
        estudiantes.add(new Estudiante("MArio", "Perez", 25, 12));
        estudiantes.add(new Estudiante("Ramiro", "Perez", 21, 255));
        estudiantes.add(new Estudiante("Esteban", "Perez", 28, 16));
        estudiantes.add(new Estudiante("María", "Perez", 27, 585));
        estudiantes.add(new Estudiante("Beatriz", "Perez", 26, 211));
        
        System.out.println("\nStream de estudiantes");
        Stream<Estudiante> estudiantesStream = estudiantes.parallelStream();
        estudiantesStream.forEach(estudiante -> System.out.println(estudiante.getNombre()));
        
    }
}
