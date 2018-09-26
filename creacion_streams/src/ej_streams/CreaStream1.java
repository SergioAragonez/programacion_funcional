package ej_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import pojos.Estudiante;

/**
 *
 * @author Javier Vázquez
 */
public class CreaStream1 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Curso de programación");
        stream1.forEach(System.out::println);
        
        Stream<String> stream2 = 
                Stream.of("curso1", "curso2", "curso3", "curso4");
        stream2.forEach(System.out::println);
        
        String[] arreglo = {"java", "c++", "c#", "ruby"};
        Stream<String> stream3 = Stream.of(arreglo);
        
        stream3.forEach(System.out::println);
        Stream<Estudiante> streamEstudiantes = Stream.<Estudiante>builder()
                .add(new Estudiante("n01", 17, 1.70, 9.5))
                .add(new Estudiante("n02", 21, 1.70, 9.5))
                .build();
        
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante.getIdentificacion()));
        
        IntStream unoAVeinte = IntStream.rangeClosed(1, 20);
        unoAVeinte.forEach(System.out::println);
    }
}
