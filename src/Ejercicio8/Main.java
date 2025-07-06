/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */
 /*
  @author Andres Bravo
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        contarPalabras("Hola como estas HOLA COMO hola");
    }

    public static void contarPalabras(String palabra) {
        String nuevaPalabra = palabra.toLowerCase() + " ";
        int tamaño = nuevaPalabra.length();

        List<String> elementos = new ArrayList<>();

        String palabraSacada = "";

        for (int i = 0; i < tamaño; i++) {
            char caracter = nuevaPalabra.charAt(i);
            if (Separador(caracter)) {
                elementos.add(palabraSacada);
                palabraSacada = "";
            } else {
                palabraSacada = palabraSacada + caracter;
            }
        }

        Map<String, Integer> conteo = new HashMap<>();

        for (String a : elementos) {
            if (conteo.containsKey(a)) {
                conteo.put(a, conteo.get(a) + 1);
            } else {
                conteo.put(a, 1);
            }
        }

        // Mostrar resultado
        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            System.out.println(entry.getKey() + " se repite " + entry.getValue() + " veces.");
        }

        //System.out.println(elementos);
        //elementos.forEach((x) -> System.out.println(x));
    }

    public static boolean Separador(char a) {
        if (a == '.') {
            return true;
        } else if (a == ',') {
            return true;
        } else if (a == ' ') {
            return true;
        } else {
            return false;
        }
    }

}
