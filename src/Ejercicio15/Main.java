/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

import java.util.Stack;

/**
 *
 * @author Andres Bravo
 */
/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */
public class Main {

    public static void main(String[] args) {
        //int numero = 153;
        int numero = 153;
        System.out.println(numeroArmstrong(numero));

    }

    public static boolean numeroArmstrong(int numero) {
        Stack<Integer> digitos = new Stack<>();
        int cantidadDigitos = 0;
        int division = numero;
        boolean continuar = true;
        while (continuar) {
            if (division == 0) {
                continuar = false;
            } else {
                int modulo = division % 10;
                digitos.push(modulo); //añadimos al stack 
                division = division / 10;
                cantidadDigitos++;

            }
        }

        return VerificarNumeroArmstrong(digitos, numero, cantidadDigitos);
    }

    public static boolean VerificarNumeroArmstrong(Stack<Integer> digitos, int numero, int n) {
        int suma = 0;
        while (!digitos.isEmpty()) {
            int digit = digitos.pop();
            suma += (int) Math.pow(digit, n);
        }
        System.out.println(suma);
        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }
}
