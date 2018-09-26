package ejercicio4;

/**
 *
 * @author Javier Vázquez
 */
public class Main {
    public static void main(String[] args) {
        
        
        System.out.println(create().calculate(2, 2));
    }
    
    private static CalculadorLong create(){
        long var = 20l;
        
        return (x, y) -> x / y;
    }
}
