/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio12;

/**
 *
 * @author Andres Bravo
 */
/*
 * Crea una función que reciba dos cadenas como parámetro (str1, str2)
 * e imprima otras dos cadenas como salida (out1, out2).
 * - out1 contendrá todos los caracteres presentes en la str1 pero NO
 *   estén presentes en str2.
 * - out2 contendrá todos los caracteres presentes en la str2 pero NO
 *   estén presentes en str1.
 */
public class Main {

    public static void main(String[] args) {
        String palabra = "Alemania";
        String palabra2 = "Espania";
        //System.out.println("hola vamos a revisar");
        Parametros(palabra, palabra2);

    }

    public static void Parametros(String str1, String str2) {

        String out1 = PrimeraComparacion(str1, str2);
        String out2 = SegundaComparacion(str1, str2);

        System.out.println(out1);
        System.out.println(out2);
    }

    public static String PrimeraComparacion(String str1, String str2) {
        String res = "";

        for (int i = 0; i < str1.length(); i++) {
            char caracter = str1.charAt(i);
            boolean exist = Existe(caracter, str2);
            if (!exist) {
                res = res + caracter;
            }
        }
        return res;
    }

    public static boolean Existe(char caracter, String str) {
        boolean res = false;
        for (int i = 0; i < str.length(); i++) {
            if (caracter == str.charAt(i)) {
                return true;
            }
        }
        return res;
    }

    public static String SegundaComparacion(String str1, String str2) {
        String res = "";

        for (int i = 0; i < str2.length(); i++) {
            char caracter = str2.charAt(i);
            boolean exist = Existe(caracter, str1);
            if (!exist) {
                res = res + caracter;
            }
        }
        return res;

    }
}
