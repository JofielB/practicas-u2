package eva2_practica_recursion_4;

/**
 *
 * @author EL CACTO
 */
public class P4 {

    public static void main(String[] args) {
        String prueba = "yyzzza";
        System.out.println(limpiarT(prueba));
    }
    
    public static String limpiarT(String p){
        if(p.length()>2){
            if((p.charAt(0)+"").equals((""+p.charAt(1)))){
                return limpiarT(p.substring(1));
            }else{
                return p.charAt(0) + limpiarT(p.substring(1));
            }
        }else
            return p;
    }
    
}
