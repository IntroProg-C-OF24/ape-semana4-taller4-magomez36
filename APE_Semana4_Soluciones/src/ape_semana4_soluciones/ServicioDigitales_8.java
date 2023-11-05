/*
-Algoritmo-8
Se debe generar un algoritmo que permite calcular y mostrar el valor total a pagar mensual de servicios digitales de una persona. Los servicios digitales son: Netflix, YouTube premium, Dropbox, Spotify. Si la persona es menor a 30 años se descuenta el 20% del total mensual.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class ServicioDigitales_8 {
    public static void main(String[] args) {
        double valorMenNetflix, valorMenYouTubePremium, valorMenDropbox, valorMenSpotify, descuentoMenorEdad30anios, valorTotal;
        double porcentajeDescuentoMenorEdad30anios = 20;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar Valor Mensual de Netflix");
        valorMenNetflix = teclado.nextDouble();
        System.out.println("Ingresar Valor Mensual de Youtube Premium");
        valorMenYouTubePremium = teclado.nextDouble();
        System.out.println("Ingresar Valor Mensual de Dropbox");
        valorMenDropbox = teclado.nextDouble();
        System.out.println("Ingresar Valor Mensual de Spotify");
        valorMenSpotify = teclado.nextDouble();
        descuentoMenorEdad30anios = ((valorMenNetflix + valorMenYouTubePremium + valorMenDropbox + valorMenSpotify) * porcentajeDescuentoMenorEdad30anios) /100;
        valorTotal = (valorMenNetflix + valorMenYouTubePremium + valorMenDropbox + valorMenSpotify) - descuentoMenorEdad30anios;
        System.out.println("El Valor Total a Pagar Mensual de Servicios Digitales es: " + valorTotal);
    }
    
}
