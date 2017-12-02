package eva2_4_cadenas;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        /*for (int i = 1; i < 10; i++) {
            System.out.println(crearCadena(i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(crearCadena(i));
        }*/
        //
        for (int i = 1,b=8; i < 10 || b >= 1; i++) {
            if(i<10)
                System.out.println(crearCadena(i));
            else{
                System.out.println(crearCadena(b));
                b--;
            }
        }
        
    }
    public static String crearCadena(int v){
        if(v>1){
            return "*" + crearCadena(v-1);
        }else
            return "*";
    }
    
}
