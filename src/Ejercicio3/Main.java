/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}
