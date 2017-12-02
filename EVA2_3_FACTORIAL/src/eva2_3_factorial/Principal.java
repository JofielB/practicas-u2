package eva2_3_factorial;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("El Factorial de 3  es: "+factorial(3));
        System.out.println("El Factorial de 5  es: "+factorial(5));
        System.out.println("El Factorial de 10 es: "+factorial(10));
    }
    public static int factorial(int v) {
        if(v == 0){
            return 1;
        }else
            return v * factorial(v-1);
    }
    
}