package ejercicio2;

/**
 *
 * @author Javier Vázquez
 */
public class LamdaTest2 {
    public static void main(String[] args) {
        
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        
       LamdaTest2 objeto = new LamdaTest2();
       
       objeto.miMetodo((num1, num2) -> 
               System.out.println("parametro1: " + num1 + " parametro2: " + num2), 
               25, 30);
        
    }
    
    public void miMetodo(Operaciones op, int num1, int num2){
        op.imprimeOperacion(num1, num2);
    }
}
