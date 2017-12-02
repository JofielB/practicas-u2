package eva2_13_collection_linked_list;
import java.util.LinkedList;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
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
        llMilista.remove(1);
        for (String string : llMilista) {
            System.out.print(string + " - ");

        }
        System.out.println("");
        llMilista.add(4, "Transexualxd");
        for (String string : llMilista) {
            System.out.print(string + " - ");

        }
        System.out.println("");
        System.out.println(llMilista.size());

    }
}
