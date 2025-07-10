/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;

/**
 *
 * @author Andres Bravo
 */
/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
  * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */
public class Main {

    public static void main(String[] args) {
        String palabra = "Ana llev al oso la avellana";

        System.out.println(esPalindromo(palabra));
    }

    public static boolean esPalindromo(String palabra) {
        boolean respuesta = false;
        String nueva = palabra.toLowerCase(); //convertir todo a minuscula

        String construir = "";
        for (int i = 0; i < nueva.length(); i++) {
            char aux = QuitarTilde(nueva.charAt(i)); //A
            if (!isSigno(aux)) {
                construir = construir + aux;
            }
        }
        String inverso = "";
        for (int i = construir.length() - 1; i > -1; i--) {
            inverso = inverso + construir.charAt(i);
        }

        if (construir.equals(inverso)) {
            respuesta = true;
        }
        return respuesta;
    }

    public static char QuitarTilde(char a) {
        if (a == 'á') {
            return 'a';
        } else if (a == 'é') {
            return 'e';
        } else if ('í' == a) {
            return 'i';
        } else if (a == 'ó') {
            return 'o';
        } else if (a == 'ú') {
            return 'u';
        } else {
            return a;
        }
    }

    public static boolean isSigno(char a) {
        if (a == ';') {
            return true;
        } else if (a == ',') {
            return true;
        } else if (a == '.') {
            return true;
        } else if (a == ' ') {
            return true;
        } else {
            return false;
        }
    }
}
