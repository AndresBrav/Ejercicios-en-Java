/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio17;

/**
 *
 * @author Asus
 */
/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */
public class Main {

    public static void main(String[] args) {

        String palabra = "Hola a todos, como estan";
        System.out.println(Mayusculas(palabra));
    }

    public static String Mayusculas(String palabra) {
        StringBuilder nueva = new StringBuilder();

        int i = 0;
        while (i < palabra.length()) {
            char caracter = palabra.charAt(i);

            if (i == 0 && !isSignoPuntuacion(caracter)) {
                String mayus = "" + caracter;
                String aux = mayus.toUpperCase();
                //System.out.println(aux);
                nueva.append(aux);
            }

            if (isSignoPuntuacion(caracter)) {
                nueva.append(caracter);
            }

            if (i > 0 && isSignoPuntuacion(palabra.charAt(i - 1)) && !isSignoPuntuacion(caracter)) {
                String mayus = "" + caracter;
                String aux = mayus.toUpperCase();
                //System.out.println(aux);
                nueva.append(aux);
            }

            if (i > 0 && !isSignoPuntuacion(palabra.charAt(i-1)) && !isSignoPuntuacion(caracter)) {
                nueva.append(caracter);
            }

            i++;
        }

        String result = nueva.toString();
        return result;
    }

    public static boolean isSignoPuntuacion(char caracter) {

        if (caracter == ' ' || caracter == '.' || caracter == ',') {
            return true;
        } else {
            return false;
        }

    }

}
