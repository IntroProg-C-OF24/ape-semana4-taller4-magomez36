/*
Se desea desarrollar un algoritmo que permita mostrar la tabla de multiplicar de un número ingresado por el usuario; solo en el caso que el valor del número esté entre 2 y 6.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class TablaMultiplicar_3 {
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar Numero entre el 2 y 6");
        numeroUsuario = teclado.nextInt();
        if (numeroUsuario>=2&&numeroUsuario<=6){
            System.out.println("Tabla del: "+numeroUsuario);
            for (int n1=1 ; n1<=12 ; n1 ++){
                System.out.println(n1+"x"+numeroUsuario+"="+numeroUsuario*n1);
            }
        }else {
            System.out.println("Numero no Valido");
        }
    }
}
