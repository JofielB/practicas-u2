package eva2_8_lista_enlazada;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        Lista primerLista = new Lista();
        primerLista.imprimirLista();

        primerLista.agregarNodo(new Nodo(100));
        primerLista.imprimirLista();
        System.out.println("");

        primerLista.agregarNodo(new Nodo(200));
        primerLista.imprimirLista();
        System.out.println("");

        primerLista.agregarNodo(new Nodo(300));
        primerLista.imprimirLista();

        primerLista.vaciarLista();
        primerLista.imprimirLista();
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            primerLista.agregarNodo(new Nodo(i));
        }
        System.out.println(primerLista.contarNodos());

        try {
            System.out.println(primerLista.valorEn(8));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        primerLista.insertarEn(0, new Nodo(98));
        primerLista.imprimirLista();
        System.out.println("");
        
        primerLista.insertarEn(11, new Nodo(88));
        primerLista.imprimirLista();
        System.out.println("");
        
        primerLista.insertarEn(4, new Nodo(24));
        primerLista.imprimirLista();
    }
}
//CLASE NODO

class Nodo {

    private int iVal;
    private Nodo nSig;

    public Nodo() {
        iVal = 0;
        nSig = null;
    }

    public Nodo(int val) {
        iVal = val;
        nSig = null;
    }

    public Nodo(int iNum, Nodo nNodo) {
        iVal = iNum;
        nSig = nNodo;
    }

    public int getiVal() {
        return iVal;
    }

    public void setiVal(int iVal) {
        this.iVal = iVal;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }
}
//CLASE LISTA

class Lista {

    private Nodo nIni;
    private Nodo nFin;

    public Lista() {
        nIni = null;
        nFin = null;
    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    /*NO FUNCIONAL
    public void agregarNodo(Nodo nodo) { //AGREGA AL FINAL 
        if (nIni == null) {
            nIni = nodo; // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL
            Nodo nTemp = nIni;
            while (nTemp.getnSig() != null) {
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nodo);
        }

    }*/
    public void agregarNodo(Nodo nodo) {
        if (nIni == null) {
            nIni = nodo;
            nFin = nodo;
        } else {
            nFin.setnSig(nodo);//AGREGAMOS NUEVO NODO
            nFin = nodo;
        }
    }

    public void imprimirLista() {
        if (nIni == null) {
            System.out.println("Lista Vacia"); // LISTA VACIA
        } else { //RECOOREMOS HASTA EL FINAL IMPRIMIENDO
            Nodo nTemp = nIni;
            while (nTemp != null) {
                System.out.print(nTemp.getiVal() + " - ");
                nTemp = nTemp.getnSig();
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
                nTemp = nTemp.getnSig();
            }
        }
        return contador;
    }
    
    public int valorEn(int posicion) throws Exception {

        if (posicion < 0 || posicion >= contarNodos()) {
            throw new Exception("VALORES ERRONEOS, INGRESAR ERRORES ENTRE 0 Y EL TAMAÑO DE LA LISTA NO TE MAMES PLESE");
        }
        int contador;
        int valor;

        Nodo nTemp = nIni;
        contador = 0;
        while (contador < posicion) {
            contador++;
            nTemp = nTemp.getnSig();
        }
        valor = nTemp.getiVal();
        return valor;
    }

    public void insertarEn(int posicion, Nodo nInsertar) {
        //AL IGRESAR EN LA POSICION 0
        if (posicion == 0) {
            nInsertar.setnSig(nIni);
            nIni = nInsertar;
        }
        //EN LA ULTIMA POSICION
        else if (posicion == contarNodos()) {
            agregarNodo(nInsertar);
        }
        //CUALQUIER OTRA POSICION
        else {
            int contador = 0;
            Nodo nTemp = nIni;
            while (contador < posicion-1) {
                nTemp = nTemp.getnSig();
                contador++;
            }
            nInsertar.setnSig(nTemp.getnSig());
            nTemp.setnSig(nInsertar);
        }
    }
}
