package eva2_practica_recursion_5;
/**
 *
 * @author EL CACTO
 */
public class Principal {

    public static void main(String[] args) {
        String p = "(()";
        System.out.println(parentesisLocos(p));
    }

    public static boolean parentesisLocos(String par) {
        if(par.length() == 2 && (""+par.charAt(0)).equals("(")&&((""+par.charAt(par.length()-1))).equals(")") ){
            return true;
        }
        else if(par.length()<2){
            return false;
        }
        else {
            if((""+par.charAt(0)).equals("(")&&((""+par.charAt(par.length()-1))).equals(")")){
                return parentesisLocos(par.substring(1, par.length()-1));
            }else{
                return false;
            }
        }
    }
}