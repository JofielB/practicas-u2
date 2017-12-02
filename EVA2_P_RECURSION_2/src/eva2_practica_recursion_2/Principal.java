package eva2_practica_recursion_2;

/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        String prueba = "xxxxsoy laxxxxxxxx vxxxexxrxxga";
        System.out.println(alaVConX(prueba));
        
    }
    
    public static String alaVConX(String p){
        if(p.equals("")){
            return "";
        }else if((p.charAt(0)+"").equals("x")){
            return "" + alaVConX(p.substring(1));
        }
        else{
            return "" + p.charAt(0) + alaVConX(p.substring(1));
        }
    }
    
}
