package ejemploswitch;

import java.util.Scanner;

/**
 *
 * @author quique
 */
public class EjemploSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    
    Metodos obj = new Metodos();
    
    System.out.println("**** MENU ****\n1-Lunes\n2-Martes\n3-Miercoles\n4-Jueves\n5-Viernes\n6-Sabado\n7-Domingo");
   
    System.out.println("Introduzca una opcion");
        
    String op = sc.nextLine();
    
    obj.comparar(op);
    
        
    }
    
}
