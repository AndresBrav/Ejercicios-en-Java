/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.Ejercicio5;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5, 5);
        Rectangulo rectangulo = new Rectangulo(10, 4);
        Triangulo triangulo = new Triangulo(2, 8);

        System.out.println(CalcularArea(cuadrado));
        System.out.println(CalcularArea(rectangulo));
        System.out.println(CalcularArea(triangulo));

    }

    /*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
     */
    public static double CalcularArea(Poligono a) {
        /*if (a instanceof Cuadrado) {
            return a.CalcularArea();
        } else if (a instanceof Triangulo) {
            return a.CalcularArea();
        } else if (a instanceof Rectangulo) {
            return a.CalcularArea();
        } else {
            return 0.0;
        }*/
        return a.CalcularArea();
    }

}
