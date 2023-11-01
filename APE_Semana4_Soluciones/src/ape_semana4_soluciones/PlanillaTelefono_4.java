/*
-Algoritmo-4
Generar un algoritmo que permita calcular y mostrar el valor de la planilla de teléfono de una casa. Se debe ingresar el costo por minutos, el número de minutos consumidos en el mes.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class PlanillaTelefono_4 {
    public static void main(String[] args) {
        double numeroMinutosConsumidosMes, costoMinutos, valorPlanillaTelefono;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de minutos consumidos en el mes");
        numeroMinutosConsumidosMes = teclado.nextDouble();
        System.out.println("Ingrese el costo por minutos de minutos");
        costoMinutos = teclado.nextDouble();
        valorPlanillaTelefono = (numeroMinutosConsumidosMes * costoMinutos);
        System.out.println("EL VALOR DE LA PLANILLA DE TELEFONO ES:" + valorPlanillaTelefono);
    }
}
