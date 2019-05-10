
package paquetelaboratorio;
import java.util.Scanner;

public class EjemploSwitch1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String num="";
        System.out.println("Ingrese el número de placa por favor");
        num = entrada.next();
        char placa = num.charAt(0);
        switch(placa){
            case 'E':
            case 'e':
                System.out.printf("Su placa  %s es de la provincia de Esmeraldas \n",  num.toUpperCase());
                break;
            case 'o':
            case 'O':
                System.out.printf("Su placa  %s es de la provincia de El Oro \n",  num.toUpperCase());
                break;
            case 'g':
            case 'G':
                System.out.printf("Su placa  %s es de la provincia de Guayas \n",  num.toUpperCase());
                break;
            case 'r':
            case 'R':
                System.out.printf("Su placa  %s es de la provincia de Los Ríos \n",  num.toUpperCase());
                break;
            case 'm':
            case 'M':
                System.out.printf("Su placa  %s es de la provincia de Manabí \n",  num.toUpperCase());
                break;
            case 'y':
            case 'Y':
                System.out.printf("Su placa  %s es de la provincia de Santa Elena \n",  num.toUpperCase());
                break;
            case 'j':
            case 'J':
                System.out.printf("Su placa  %s es de la provincia de Santo Domingo de los Tsáchilas \n",  num.toUpperCase());
                break;
            default:
                System.out.println("Su placa no corresponde a esta región");
        }
    }
}
