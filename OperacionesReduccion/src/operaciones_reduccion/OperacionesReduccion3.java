package operaciones_reduccion;

import java.util.stream.IntStream;

/**
 *
 * @author Javier Vázquez
 */
public class OperacionesReduccion3 {
    public static void main(String[] args) {
         System.out.println(IntStream.range(1, 20)
                 .summaryStatistics());
         
         System.out.println("Suma: " + 
                 IntStream.range(1, 20)
                          .summaryStatistics()
                          .getSum());
         
         System.out.println("Promedio: " + 
                 IntStream.range(1, 20)
                          .summaryStatistics()
                          .getAverage());
         
    }
}
