package ejercicio1;

import java.util.function.Predicate;

/**
 *
 * @author Javier Vázquez
 */
public class TestPredicate1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (valor) -> valor > 0;
        
        System.out.println(predicate.test(123));
    }
}
