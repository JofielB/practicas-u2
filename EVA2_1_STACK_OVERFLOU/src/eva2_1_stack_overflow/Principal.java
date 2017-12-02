package eva2_1_stack_overflow;

/**
 *
 * @author EL CACTO
 */
public class Principal{

    public static void main(String[] args) {
        recursivo();
    }
    //SATURAR LA MEMORIA CON UN METODO RECURSIVO XDD
    public static void recursivo() {
        System.out.println("Recursivo");
        recursivo();
    }
}
