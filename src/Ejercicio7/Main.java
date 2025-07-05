/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(retornarInverso("Hola mundo"));
    }

    public static String retornarInverso(String palabra) {
        String nuevaPalabra = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            char caracter = palabra.charAt(i);
            nuevaPalabra = nuevaPalabra + caracter;
        }
        return nuevaPalabra;
    }
}
