package ejemploswitch;

/**
 *
 * @author quique
 */
public class Metodos {
    
    public void comparar (String op){

    switch(op){
    case "Lunes": System.out.println("Lunes");
        break;
    case "Martes": System.out.println("Martes"); 
        break;
    case "Miercoles": System.out.println("Miercoles"); 
        break;
    case "Jueves": System.out.println("Jueves");
        break;
    case "Viernes": System.out.println("Viernes");
        break;
    case "Sabado": System.out.println("Sabado");
        break;
    case "Domingo": System.out.println("Domingo");
        break;
    default: System.out.println("Error");
        break;
    }
   
    
    }
    
}
