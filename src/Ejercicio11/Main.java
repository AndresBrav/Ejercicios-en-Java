/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;

/**
 *
 * @author Andres Bravo
 */

/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long start2 = System.nanoTime();
        balanceado("{ ( ) [ a * ( c + d ) ] - [5 }]");
        balanceado("( a [ ]* ( ( c + d ) ) - 5 )");
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;
        System.out.println("Tiempo ResolucionMejorada: " + duration2 + " ns (" + (duration2 / 1_000_000.0) + " ms)");
    }

    public static void balanceado(String expresion) {
        ArrayList<Character> signos = llenarArregloCaracteres(expresion);

        if (signos.size() % 2 != 0) {
            System.out.println("No esta balanceado");
        } else {
            int i = 0;
            while (!signos.isEmpty()) {
                int tamaño = signos.size();
                char primero = signos.get(i);
                char ultimo = signos.get(tamaño - 1);
                char siguiente = signos.get(i + 1);

                if (Inverso(primero, ultimo)) {
                    signos.remove(tamaño - 1);
                    signos.remove(i);
                } else if (Inverso(primero, siguiente)) {
                    signos.remove(i + 1);
                    signos.remove(i);
                } else {
                    //signos.clear();
                    System.out.println("El arreglo no es Balanceado");
                    break;
                }
                System.out.println("el arreglo ahora es " + signos);
            }
            //System.out.println("El arreglo es balanceado");
            if (signos.isEmpty()) {
                System.out.println("El arreglo esta balanceado");
            }
        }
    }

    public static boolean Inverso(char elemento, char siguiente) {
        if (elemento == '{' && siguiente == '}') {
            return true;
        } else if (elemento == '[' && siguiente == ']') {
            return true;
        } else if (elemento == '(' && siguiente == ')') {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Character> llenarArregloCaracteres(String expresion) {
        ArrayList<Character> signos2 = new ArrayList<>();
        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            if (isSigno(caracter)) {
                signos2.add(caracter);
            }
        }
        return signos2;
    }

    public static boolean isSigno(char a) {
        if (a == '{' || a == '}' || a == '[' || a == ']' || a == '(' || a == ')') {
            return true;
        } else {
            return false;
        }
    }
}
