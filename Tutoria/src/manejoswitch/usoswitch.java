
package manejoswitch;

/**
 *
 * @author javie
 */
public class usoswitch {
    public static void main(String[] args) {
        String cadena = "Martes ";
        switch (cadena){
            case "Lunes":
                System.out.printf("Día %s" ,cadena);
                break;
            
            case "Martes":
                System.out.printf("Día %s", cadena);
                break;
             
            default:
                System.out.println("Ninguna opción disponible");
        }
    }
    
}
