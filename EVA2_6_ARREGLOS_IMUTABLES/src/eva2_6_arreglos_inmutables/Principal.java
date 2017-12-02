package eva2_6_arreglos_inmutables;


/**
 *
 * @author EL CACTO
 */
public class Principal {
    
    public static void main(String[] args) {
        int[] aiDatos = new int[3];
        aiDatos[0]= 100;
        aiDatos[1]= 200;
        aiDatos[2]= 300;
        System.out.println("Array de 3");
        for (int aiDato : aiDatos) {
            System.out.print(aiDato+"-");
        }
        System.out.println("");
        //HACIENDO UNA COPIA DE DATOS ACTUALES
        int[] aiCopia = new int[3];
        for (int i = 0; i < aiDatos.length; i++) {
            aiCopia[i] = aiDatos[i];
        }
        //RESTAURNDO LOS DATOS
        aiDatos =  new int[4];
        System.out.println("Array de 4");
        for (int i = 0; i < aiCopia.length; i++) {
            aiDatos[i] = aiCopia[i];
        }
        for (int i : aiDatos) {
            System.out.print(i+"-");
        }   
        
    }
    
}