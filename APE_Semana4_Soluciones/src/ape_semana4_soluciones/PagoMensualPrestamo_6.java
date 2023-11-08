/*
-Algoritmo-6
Generar una solución que permita calcular y mostrar el pago mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del préstamo y el interés mensual a cobrar.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class PagoMensualPrestamo_6 {
    public static void main(String[] args) {
        double montoPrestamo, porcentajeInteresMensual, interesMensual, pagoMensualPrestamo;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresar Monto del Prestamo");
        montoPrestamo = teclado.nextDouble();
        System.out.println("Ingresar el Porcentaje del Interes Mensual");
        porcentajeInteresMensual = teclado.nextDouble();
        interesMensual = ((montoPrestamo * porcentajeInteresMensual) /100) /12;
        pagoMensualPrestamo = (montoPrestamo / 12 ) + interesMensual;
        System.out.println("El pago Mensual de un Prestamo de 1 year de plazo es: " + pagoMensualPrestamo);
    }
}
//Autor: Manuel Gomez