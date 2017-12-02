package eva2_17_ordenar_objetos;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author EL CACTO
 */
public class Pricipal {

 
    public static void main(String[] args) {
        LinkedList<Persona> lListaPer = new LinkedList();
        lListaPer.add(new Persona("luis", "vilalobos", 21, 48, true));
        lListaPer.add(new Persona("chiquistriquis", "sueltacalzon", 20, 94, false));
        lListaPer.add(new Persona("gabriela", "zaens", 5, 2, true));
        lListaPer.add(new Persona("pawerranller", "rojo", 3, 0, true));
        lListaPer.add(new Persona("jesus", "crais", 45, 49, true));
        for (Persona persona : lListaPer) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad: " + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        //ACOMODO POR EDAD
        Comparator cMiOrdenPer = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                int e1, e2;
                e1 = p1.getEdad();
                e2 = p2.getEdad();
                return e1 - e2;
            }
        };
        Collections.sort(lListaPer, cMiOrdenPer);

        for (Persona persona : lListaPer) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad: " + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        //ACOMODO POR SALARIO
        Comparator cOrdenSalario = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                int s1, s2;
                s1 = (int) p1.getSalario();
                s2 = (int) p2.getSalario();
                return s1 - s2;
            }
        };
        Collections.sort(lListaPer, cOrdenSalario);
        for (Persona persona : lListaPer) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad: " + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        //ACOMODO APELLIDO Y EDAD
        Comparator cOrdenAE = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                char c1, c2;
                c1 = p1.getApellido().charAt(0);
                c2 = p2.getApellido().charAt(0);
                int e1, e2;
                e1 = p1.getEdad();
                e2 = p2.getEdad();
                if (c1 == c2) {
                    return e1 - e2;
                } else {
                    return c1 - c2;
                }
            }
        };
        Collections.sort(lListaPer, cOrdenAE);
        for (Persona persona : lListaPer) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad: " + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
        //ACOMODO APPELLIDO TODAS LAS LETRAS
        Comparator cOrdenAC = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1, p2;
                p1 = (Persona) o1;
                p2 = (Persona) o2;
                char c1, c2;
                c1 = p1.getApellido().charAt(0);
                c2 = p2.getApellido().charAt(0);
                int primerApellido = p1.getApellido().length();
                int segundoApellido = p2.getApellido().length();
                if (c1 == c2) {
                    if (primerApellido == segundoApellido) {
                        for (int i = 0; i < primerApellido; i++) {
                            if (p1.getApellido().charAt(i) != p2.getApellido().charAt(i)) {
                                return p1.getApellido().charAt(i) - p2.getApellido().charAt(i);
                            }
                        }
                    } else if (primerApellido > segundoApellido) {
                        for (int i = 0; i < segundoApellido; i++) {
                            if (p1.getApellido().charAt(i) != p2.getApellido().charAt(i)) {
                                return p1.getApellido().charAt(i) - p2.getApellido().charAt(i);
                            }
                            return 0;
                        }
                    } else if (primerApellido < segundoApellido) {
                        for (int i = 0; i < primerApellido; i++) {
                            if (p1.getApellido().charAt(i) != p2.getApellido().charAt(i)) {
                                return p1.getApellido().charAt(i) - p2.getApellido().charAt(i);
                            }
                        }
                        return -127;
                    }

                } else {
                    return c1 - c2;
                }
                return 0;
            }
        };

        Collections.sort(lListaPer, cOrdenAC);
        for (Persona persona : lListaPer) {
            System.out.println("Nombre: " + persona.getNombre() + "\n"
                    + "Apellido: " + persona.getApellido() + "\n"
                    + "Edad: " + persona.getEdad() + "\n"
                    + "Salario: " + persona.getSalario() + "\n"
                    + "Sexo: " + persona.isSexo() + "\n");
        }
    }
}

class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private boolean sexo;

    public Persona() {
        nombre = "";
        apellido = "";
        edad = 0;
        salario = 0;
        sexo = false;

    }

    public Persona(String nombre, String apellido, int edad, double salario, boolean sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
