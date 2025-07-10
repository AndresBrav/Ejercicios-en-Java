/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Asus
 */
public class Limbert {

    public static void main(String[] args) {
        long start2 = System.nanoTime();
        System.out.println(signos("{ ( ) [ a * ( c + d ) ] - [5 }]"));
        System.out.println(signos("( a [ ]* ( ( c + d ) ) - 5 )"));
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;
        System.out.println("Tiempo ResolucionMejorada: " + duration2 + " ns (" + (duration2 / 1_000_000.0) + " ms)");
    }

    public static boolean signos(String palabra) {

        char[] a = {'(', '{', '¿', '['};
        char[] c = {')', '}', '?', ']'};

        for (int i = 0; i < palabra.length(); i++) {
            verificar(palabra.charAt(i), a);
            verificar(palabra.charAt(i), c);
        }

        boolean cumple = true;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] == 1 || c[i] == 1) && a[i] != c[i]) {
                cumple = false;
            }
        }
        return cumple;
    }

    private static void verificar(char c, char[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == c) {
                a[i] = 1;
            }
        }
    }
}
