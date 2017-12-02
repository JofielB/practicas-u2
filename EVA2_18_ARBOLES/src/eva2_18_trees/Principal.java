package eva2_18_trees;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        Tree trMiArbol = new Tree(new Nodo(100));
        try {
            trMiArbol.agregarNodo(new Nodo(90), trMiArbol.getnRoot());
            trMiArbol.agregarNodo(new Nodo(101), trMiArbol.getnRoot());
            trMiArbol.agregarNodo(new Nodo(92), trMiArbol.getnRoot());
            trMiArbol.agregarNodo(new Nodo(80), trMiArbol.getnRoot());
            trMiArbol.agregarNodo(new Nodo(110), trMiArbol.getnRoot());
            trMiArbol.agregarNodo(new Nodo(105), trMiArbol.getnRoot());
            System.out.println("Pre Order");
            trMiArbol.preOrder();
            System.out.println("\n" + "Pos Order");
            trMiArbol.posOrder();
            System.out.println("\n" + "In Order");
            trMiArbol.inOrder();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

class Nodo {

    private int iVal;
    private Nodo nIzq;
    private Nodo nDer;

    public Nodo() {
        iVal = 0;
        nIzq = null;
        nDer = null;
    }

    public Nodo(int iVal) {
        this.iVal = iVal;
        this.nIzq = null;
        this.nDer = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }
}

class Tree {

    private Nodo nRoot;

    public Tree() {
        nRoot = null;
    }

    public Tree(Nodo nRoot) {
        this.nRoot = nRoot;
    }

    public Nodo getnRoot() {
        return nRoot;
    }

    public void agregarNodo(Nodo nNodo, Nodo nActual) throws Exception {
        if (nRoot == null) {
            nRoot = nNodo;
        } else {//NO ESTA VACIA LA LISTA
            if (nNodo.getiVal() < nActual.getiVal()) {//SI ES MENOR
                if (nActual.getnIzq() == null) {//ESTA VACIO
                    nActual.setnIzq(nNodo);
                } else {//NO ESTA VACIO
                    agregarNodo(nNodo, nActual.getnIzq());
                }
            } else if (nNodo.getiVal() > nActual.getiVal()) {//SI ES MAYOR
                if (nActual.getnDer() == null) {//ESTA VACIO
                    nActual.setnDer(nNodo);
                } else {//NO ESTA VACIO
                    agregarNodo(nNodo, nActual.getnDer());
                }
            } else {//SI ES IGUAL
                throw new Exception("NO SE PUEDEN INGRESAR VALORES REPETIDOS");
            }
        }
    }

    public void preOrder() {
        pOT(nRoot);
    }

    private void pOT(Nodo nActual) {
        if (nActual != null) {
            System.out.print(nActual.getiVal() + "-"); //VISTAR EL NODO
            pOT(nActual.getnIzq());//RECORREMOS EL LADO IZQUIERDO
            pOT(nActual.getnDer());//RECORREMOS EL LADO DERECHO
        }
    }

    public void posOrder() {
        pO(nRoot);
    }

    private void pO(Nodo nActual) {
        if (nActual != null) {
            pO(nActual.getnIzq());//RECORREMOS EL LADO IZQUIERDO
            pO(nActual.getnDer());//RECORREMOS EL LADO 
            System.out.print(nActual.getiVal() + "-");//VISTAR EL NODO
            
        }
    }

    public void inOrder() {
        iO(nRoot);
    }

    private void iO(Nodo nActual) {
        if (nActual != null) {
            iO(nActual.getnIzq());//RECORREMOS EL LADO IZQUIERDO
            System.out.print(nActual.getiVal() + "-"); //VISTAR EL NODO
            iO(nActual.getnDer());//RECORREMOS EL LADO DERECHO
        }
    }
}
