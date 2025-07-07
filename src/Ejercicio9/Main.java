/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */
/**
 *
 * @author Andres Bravo
 */
public class Main {

    public static void main(String[] args) {
        int numero = 0;
        List<Integer> binario = Transformar(numero);

        String binarioFinal = "";
        for (int i = 0; i < binario.size(); i++) {
            binarioFinal = binarioFinal + binario.get(i);
        }

        System.out.println("el binario de " + numero + " es : " + binarioFinal);

        /*binario.forEach(x -> {
            System.out.println("Digito:");
            System.out.println(x);
        });*/
    }

    public static List<Integer> Transformar(int numero) {
        List<Integer> digitos = new ArrayList<>();

        int resultado = numero;
        boolean dividir = true;
        if (resultado == 0) {
            digitos.add(0);
            dividir = false;
        }
        while (dividir) {
            if (resultado > 0) {
                int residuo = resultado % 2;
                resultado = resultado / 2;
                digitos.add(residuo);
                
            } else {
                dividir = false;
            }
        }
        //System.out.println(digitos);
        Collections.reverse(digitos);
        //System.out.println(digitos);
        return digitos;
    }
}
