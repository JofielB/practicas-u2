package eva2_2_falso_for;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    
    public static void main(String[] args) {
        falsoFor(5);
        System.out.println("");
        falsoForAdelante(1, 5);
    }
    //FOR CON RECURSIVIDAD
    public static void falsoFor(int l){
        System.out.print(l + " ");
        if(l > 1){
            falsoFor(l-1);
        }
    }
    //FOR PARA ADELANTE
    public static void falsoForAdelante(int vI, int vF){
        System.out.print(vI + " ");
        if(vI < vF){
            falsoForAdelante(vI+1, vF);
        }
    }
    
}
