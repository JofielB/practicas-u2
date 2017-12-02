package eva2_7_nodos;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        Nodo a = new Nodo(100);
        Nodo b = new Nodo(200);
        Nodo c = new Nodo(300);

        a.nSig = b;
        b.nSig = c;
        
        Nodo nTemp =  a;
        while (nTemp != null) {
            System.out.print(nTemp.iVal + "-");
            nTemp = nTemp.nSig;
        }
    }

}

class Nodo {

    public int iVal;
    public Nodo nSig;

    public Nodo() {
        iVal = 0;
        nSig = null;
    }

    public Nodo(int val) {
        iVal = val;
        nSig = null;
    }

}