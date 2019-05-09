
package manejoswitch;


public class switch2 {
    public static void main(String[] args) {
        String nombre="esmeraldas";
        char valor = nombre.charAt(0);
        
        switch(valor){
            case 'a':
            case 'A':
                System.out.printf("Nombre con inicial %s de %s \n", valor, nombre.toUpperCase());
                break;
            case 'e':
                System.out.printf("Nombre con inicial %s de %s \n", valor, nombre.toLowerCase());
                break;
            default:
                System.out.println("no se ha encontrado similitudes");
        }
    }
}
