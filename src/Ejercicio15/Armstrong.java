/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio15;

/**
 *
 * @author Asus
 */
public class Armstrong {

    public static boolean esArmstrong(int numero) {
        int suma = 0;
        int copia = numero;
        int cantidadDigitos = contarDigitos(numero);

        while (copia > 0) {
            int digito = copia % 10;
            suma += potencia(digito, cantidadDigitos);
            copia /= 10;
        }

        return suma == numero;
    }

    private static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }

    private static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 1634;
        System.out.println(esArmstrong(numero));
    }
}
