package eva2_16_comparator;
import java.util.Collections;
import java.util.Comparator;
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
        Comparator cmMiComparador =  new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                String sCade1, sCade2;
                sCade1 = (String) o1;
                sCade2 = (String) o2;
                char c1,c2;
                c1 = sCade1.charAt(0);
                c2 = sCade2.charAt(0);
                return c2-c1;
            }
        
        };
        Collections.sort(llMilista,cmMiComparador);
        System.out.println(llMilista);
    }
}
