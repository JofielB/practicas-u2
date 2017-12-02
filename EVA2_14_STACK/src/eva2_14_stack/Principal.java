package eva2_14_stack;
import java.util.Stack;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        Stack<Double> sMiPila = new Stack();
        sMiPila.push(2.0);
        sMiPila.push(4.2);
        sMiPila.push(24.4);
        sMiPila.push(10.4);
        sMiPila.push(8.9);
        System.out.println(sMiPila.pop());
        System.out.println(sMiPila.pop());
        System.out.println(sMiPila.peek());
        System.out.println(sMiPila.peek());
    }
    
}