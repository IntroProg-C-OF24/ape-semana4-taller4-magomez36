/*
-Algoritmo-7
Generar un algoritmo que permita calcular y mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10%.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class PlanillaLuz_7 {
    public static void main(String[] args) {
        double costoKilovatioHora, numeroKilovatioConsumido, valorPlanillaLuz, descuentoMayorEdad;
        double porcentajeDescontarMayorEdad = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Costo de Kilovatio por Hora");
        costoKilovatioHora = teclado.nextDouble();
        System.out.println("Ingresar numero de Kilovatio consumido en el mes");
        numeroKilovatioConsumido = teclado.nextDouble();
        descuentoMayorEdad = ((costoKilovatioHora * numeroKilovatioConsumido) * porcentajeDescontarMayorEdad) /100;
        valorPlanillaLuz = (costoKilovatioHora * numeroKilovatioConsumido) - descuentoMayorEdad;
        System.out.println("El valor a cancelar de la Planilla de Luz es: " + valorPlanillaLuz);
        
    }
}
