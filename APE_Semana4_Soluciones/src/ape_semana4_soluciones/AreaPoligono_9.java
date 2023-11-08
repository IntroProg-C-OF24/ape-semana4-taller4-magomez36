/*
-Algoritmo-9
El programa debe calcular el área del polígono. La figura se compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un rectángulo cuyo ancho mide lo mismo que uno de los lados del cuadrado, mientras que la altura mide lo mismo que la altura de los triángulos. Se pide que haga un programa que calcule el área total.
Por cultura general, sabemos que el área de un rectángulo se calcula multiplicando su base por su altura; el área de un triángulo rectángulo se calcula multiplicando su base por su altura, y luego dividiendo el resultado entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado la medida de uno de sus lados.
La parte interesante de este problema es determinar el mínimo número de datos que hay que preguntar.
 */
package ape_semana4_soluciones;
import java.util.Scanner;
public class AreaPoligono_9 {
    public static void main(String[] args) {
        int ladoFiguraA, alturaFiguraD, areaPoligono;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un lado de la Figura A");
        ladoFiguraA = teclado.nextInt();
        System.out.println("Ingrese la altura de la Figura D");
        alturaFiguraD = teclado.nextInt();
        areaPoligono = (ladoFiguraA ^2) + (ladoFiguraA * alturaFiguraD) +((ladoFiguraA * alturaFiguraD /2)) * 3;
        System.out.println("El Area del Poligono es:" + areaPoligono);
    }
}
//Autor: Manuel Gomez