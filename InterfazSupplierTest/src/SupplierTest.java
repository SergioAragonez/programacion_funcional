
import java.util.function.Supplier;

/**
 *
 * @author Javier Vázquez
 */
public class SupplierTest {
    
    public static void main(String[] args) {
        Supplier<String> i = () -> "Javier";
        
        System.out.println("El valor pasado es: " + i.get());
    }
    
}
