package funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import mx.com.kodikas.pojos.Comensal;

/**
 *
 * @author Javier Vázquez
 */
public class DatosComensales {
    
    public static void main(String[] args) {
        List<Comensal> listaComensales
                = Arrays.asList(new Comensal("Javier", 10, 5),
                        new Comensal("Javier", 10, 5),
                        new Comensal("Arturo", 10, 5),
                        new Comensal("Mario", 10, 5),
                        new Comensal("Aguila", 10, 5),
                        new Comensal("Lo que sea", 10, 5),
                        new Comensal("Cambio", 10, 5));
        
        List<Object> nombresComensales = 
                getDatosComensales(listaComensales, 
                        x -> {
                            if (2 == 2) {
                                return x.getNombre();
                            }
                            return null;
                        });
        
        System.out.println("La lista de nombres de comensales es la siguiente: ");
        for (Object nombreComensal : nombresComensales) {
            System.out.println("El nombre es: " + nombreComensal);
        }
        
        List<Object> montosComensales = getDatosComensales(listaComensales, 
                x -> x.getMonto_pedido());
        
        for (Object monto : montosComensales) {
            System.out.println("El monto es: " + monto);
        }
    }
    
    
    public static List<Object> getDatosComensales
        (List<Comensal> listaCom, Function<Comensal, Object> func)
        
    {
        //Esta lista guardará datos personalizados de los comensales    
        List<Object> listaDatos = new ArrayList<>();
        
        //Iterar a traves de la lista de comensales que recibimos
        for (Comensal comensal : listaCom) {
            
            listaDatos.add(func.apply(comensal));
            
        }
        
        return listaDatos;
    }  
}
