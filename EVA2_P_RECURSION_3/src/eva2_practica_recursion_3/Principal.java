package eva2_practica_recursion_3;
/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(poteN(3, 0));
    }

    public static int poteN(int n, int pote) {
        if (pote > 1) {
            return n * poteN(n, pote - 1);
        } else if (pote == 0) {
            return 1;

        } else {
            return n;
        }
    }

}