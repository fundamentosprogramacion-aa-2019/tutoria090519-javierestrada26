
package paquetelaboratorio;

import java.util.Scanner;

public class EjemploSwitch2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String num="";
        System.out.println("Ingrese el número de placa por favor");
        num = entrada.next();
        char placa = num.charAt(0);
        switch(placa){
            case 'v':
            case 'V':
                System.out.printf("Su placa  %s es de la provincia de Morona Santiago \n",  num.toUpperCase());
                break;
            case 'n':
            case 'N':
                System.out.printf("Su placa  %s es de la provincia de Napo \n",  num.toUpperCase());
                break;
            case 's':
            case 'S':
                System.out.printf("Su placa  %s es de la provincia de Pastaza \n",  num.toUpperCase());
                break;
            case 'q':
            case 'Q':
                System.out.printf("Su placa  %s es de la provincia de Orellana \n",  num.toUpperCase());
                break;
            case 'k':
            case 'K':
                System.out.printf("Su placa  %s es de la provincia de Sucumbíos \n",  num.toUpperCase());
                break;
            case 'z':
            case 'Z':
                System.out.printf("Su placa  %s es de la provincia de Zamora Chinchipe \n",  num.toUpperCase());
                break;
            default:
                System.out.println("Su placa no corresponde a esta región");
        }
    }
}
