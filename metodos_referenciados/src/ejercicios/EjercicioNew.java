package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Javier Vázquez
 */
public class EjercicioNew {

    public static void main(String[] args) {
        List<String> numerosEnString = 
                Arrays.asList("10","10","15","15","25","30","40","6","30");
        
        getResults(numerosEnString, Integer::new).forEach(EjercicioNew::multiplicarPor10);
    }
    
    public static List<Integer> getResults(List<String> datos,
            Function<String, Integer> func){
    
        List<Integer> resultados = new ArrayList<>();
        
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        
        return resultados;
        
    }
    
    public static void multiplicarPor10(int numero){
        System.out.println("El nuevo valor del dato " + numero + " es: " + numero * 10);
    }
    
}
