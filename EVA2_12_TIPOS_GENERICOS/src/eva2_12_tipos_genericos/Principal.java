package eva2_12_tipos_genericos;


/**
 *
 * @author EL CACTO
 */
public class Principal {

    
    public static void main(String[] args) {
        Nodo <String> nNodo = new Nodo("100");
        System.out.println(nNodo.getValor());
    }
    
}
class Nodo<T>{
    private T v;
    public Nodo(T nuevoV){
        v =  nuevoV;
    }

    public T getValor() {
        return v;
    }

    public void setValor(T valor) {
        this.v = valor;
    }
    
}
