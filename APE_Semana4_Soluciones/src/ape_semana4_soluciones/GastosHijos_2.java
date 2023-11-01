/*
-Algoritmo-2
Generar un algoritmo que permite ingresar los gastos de tres hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class GastosHijos_2 {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, gastosTotales;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese los gastos del hijo 1");
        gastosHijo1 = teclado.nextDouble();
        System.out.println("Ingrese los gastos del hijo 2");
        gastosHijo2 = teclado.nextDouble();
        System.out.println("Ingrese los gastos del hijo 3");
        gastosHijo3 = teclado.nextDouble();
        gastosTotales = gastosHijo1 + gastosHijo2 + gastosHijo3;
        System.out.println("LOS GASTOS TOTALES DE LOS HIJOS SON:" + gastosTotales);
    }
}
