package operaciones_reduccion;

import java.util.Scanner;
public class Aritmetica {
    public static void main(String [] arge){
     int i;
     int j;
     int suma;
     int resta;
     int mult;
     int div;
     int modulo;
     Scanner numero = new Scanner(System.in);
     System.out.println("Ingresar el primer numero:");
     i = numero.nextInt();
     System.out.println("Ingresar el segundo numero:");
     j = numero.nextInt();
     
     suma = i+ j;
     resta = i - j;
     mult = i * j;
     div = i / j;
     modulo = i % j;
     
     System.out.println("El resultado de la sumas es:" + suma);
     System.out.println("El resultado de la resta es:" + resta);
     System.out.println("El resultado de la multiplicación es:" + mult);
     System.out.println("El resultado de la división es:" + div);
     System.out.println("El resultado del modulo es:" + modulo);

    }
}
