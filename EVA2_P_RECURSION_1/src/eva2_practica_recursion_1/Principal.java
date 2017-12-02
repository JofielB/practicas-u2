package eva2_practica_recursion_1;
/**
 *
 * @author EL CACTO
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println(suma(100));
    }
    public static int suma(int v){
        if(v==0){
            return 0;
        }else
            return ((v%10)+suma(v/10));
    }  
}