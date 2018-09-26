package ejercicio;

import java.util.function.Consumer;

/**
 *
 * @author Javier Vázquez
 */
public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        
        cons.accept("Javier");
    }
}
