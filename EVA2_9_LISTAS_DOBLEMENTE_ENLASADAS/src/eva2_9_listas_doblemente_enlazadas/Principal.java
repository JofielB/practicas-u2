package eva2_9_listas_doblemente_enlazadas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL CACTO
 */
public class Principal {

  
    public static void main(String[] args) {
        ListaDE lista = new ListaDE();
        lista.imprimirNodos();
        lista.imprimirNodosInverso();
        for (int i = 0; i < 10; i++) {
            lista.agregarNodo(new Nodo(i));
        }
        lista.imprimirNodos();
        System.out.println("");
        lista.imprimirNodosInverso();
        System.out.println("");
        System.out.println("La lista tiene: " + lista.contarNodos() + " datos");
        try {
            System.out.println("Valor en posicion 8: " + lista.valorEn(8));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        lista.insertarEn(0, new Nodo(48));
        lista.imprimirNodos();
        System.out.println("");
        lista.insertarEn(11, new Nodo(94));
        lista.imprimirNodos();
        System.out.println("");
        lista.insertarEn(4, new Nodo(13));
        lista.imprimirNodos();
    }
}

class Nodo {

    private int iVal;
    private Nodo nSIg;
    private Nodo nPrev;

    public Nodo() {
        iVal = 0;
        nSIg = null;
        nPrev = null;
    }

    public Nodo(int iNum) {
        iVal = iNum;
        nSIg = null;
        nPrev = null;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSIg() {
        return nSIg;
    }

    public void setnSIg(Nodo nSIg) {
        this.nSIg = nSIg;
    }

    public Nodo getnPrev() {
        return nPrev;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }
}

class ListaDE {

    private Nodo nIni;
    private Nodo nFin;

    public ListaDE() {
        nIni = null;
        nFin = null;
    }

    public ListaDE(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    public void agregarNodo(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;
            nFin = nNodo;
        } else {
            nFin.setnSIg(nNodo);//AGREGAMOS NUEVO NODO
            nNodo.setnPrev(nFin);
            nFin = nNodo;
        }
    }

    public void imprimirNodos() {
        if (nIni == null) {
            System.out.println("Lista Vacia"); // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL IMPRIMIENDO
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSIg();
            }
        }
    }

    public void imprimirNodosInverso() {
        if (nIni == null) {
            System.out.println("Lista Vacia"); // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL IMPRIMIENDO
            Nodo nTemp = nFin;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnPrev();
            }
        }
    }

    public void vaciarLista() {
        nIni = null;
    }

    public int contarNodos() {
        int contador;
        if (nIni == null) {
            contador = 0;
        } else {
            contador = 0;
            Nodo nTemp = nIni;
            while (nTemp != null) {
                contador++;
                nTemp = nTemp.getnSIg();
            }
        }
        return contador;
    }

    public int valorEn(int posicion) throws Exception {

        if (posicion < 0 || posicion >= contarNodos()) {
            throw new Exception("VALORES ERRONEOS, INGRESAR ERRORES ENTRE 0 Y EL TAMAÑO DE LA LISTA");
        }
        int contador;
        int valor;

        Nodo nTemp = nIni;
        contador = 0;
        while (contador < posicion) {
            contador++;
            nTemp = nTemp.getnSIg();
        }
        valor = nTemp.getiVal();
        return valor;
    }
    
    public void insertarEn(int posicion, Nodo nInsertar) {
        //AL IGRESAR EN LA POSICION 0
        if (posicion == 0) {
            nInsertar.setnSIg(nIni);
            nIni.setnPrev(nInsertar);
            nIni = nInsertar;
        } //EN LA ULTIMA POSICION
        else if (posicion == contarNodos()) {
            agregarNodo(nInsertar);
        } //CUALQUIER OTRA POSICION
        else {
            int contador = 0;
            Nodo nTemp = nIni;
            while (contador < posicion - 1) {
                nTemp = nTemp.getnSIg();
                contador++;
            }
            nInsertar.setnSIg(nTemp.getnSIg());
            nInsertar.setnPrev(nTemp);
            nTemp.setnSIg(nInsertar);
            nTemp.setnPrev(nTemp.getnPrev());
        }
    }

}
