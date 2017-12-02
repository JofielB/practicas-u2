package eva2_15_sort;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        LinkedList<String> llMilista = new LinkedList();
        llMilista.add("Caca");
        llMilista.add("pedos");
        llMilista.add("astronomia");
        llMilista.add("sabritas");
        llMilista.add("cacaguates");
        llMilista.add("enloqueser");
        for (String string : llMilista) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        Collections.sort(llMilista);
        for (String string : llMilista) {
            System.out.print(string + " - ");
        }
    }
}
