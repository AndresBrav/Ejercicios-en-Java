/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class Main {

    public static void main(String[] args) {

        long start2 = System.nanoTime();
        for (int i = 1; i < 101; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;
        System.out.println("Tiempo Resolucion: " + duration2 + " ns (" + (duration2 / 1_000_000.0) + " ms)");
    }

    public static boolean esPrimo(int numero) {
        int inicio = 1;
        int contador = 0;
        while (inicio <= numero) {
            if (numero % inicio == 0) {
                contador++;
            }
            inicio++;
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
}
