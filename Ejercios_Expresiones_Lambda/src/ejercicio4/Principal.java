package ejercicio4;

/**
 *
 * @author Javier Vázquez
 */
public class Principal {
    
    public static void main(String[] args) {
        CalculadoraInt calI = (x, y) -> x + y;
        CalculadorLong calL = (x, y) -> x + y;
        
        engine(calL);
        engine(calI);
        
    } 
    
    public static void engine(CalculadoraInt cal){
    
    }
    
    public static void engine(CalculadorLong cal){
    
    }
}
