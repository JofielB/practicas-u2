package eva2_11_collections;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> alMiArregloLista = new ArrayList();
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        alMiArregloLista.add((int)((Math.random())*100)+1);
        for (Integer integer : alMiArregloLista) {
            System.out.print(integer+"-");
        }
        System.out.println("");
        alMiArregloLista.add(2,8888);
        for (Integer integer : alMiArregloLista) {
            System.out.print(integer+"-");
        }
        //RECORRER CON ITERADOR
        System.out.println("");
        Iterator itRecorreArray;
        itRecorreArray=alMiArregloLista.iterator();
        while(itRecorreArray.hasNext()){
            System.out.print(itRecorreArray.next()+"-");
        }
    }
    
}
