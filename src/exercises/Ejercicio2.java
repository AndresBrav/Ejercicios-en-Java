/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class Ejercicio2 {

    public Ejercicio2() {

    }

    /*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
     */
    public boolean funcionAnagrama(String nombre1,String nombre2) {
       
        boolean result=false;
        String palabra1 = nombre1.toLowerCase().trim();
        String palabra2 = nombre2.toLowerCase().trim();
        
         // Si son exactamente iguales, no son anagramas
        if (palabra1.equals(palabra2)) {
            return false;
        }
        
        // Si tienen diferente longitud, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        
        // Convertir a array de caracteres y ordenar
        char[] letras1 = palabra1.toCharArray();
        char[] letras2 = palabra2.toCharArray();
        
        //System.out.println(letras1);
        
         Arrays.sort(letras1); //ordena en el arreglo
         Arrays.sort(letras2);
         
         System.out.println(letras1);
         System.out.println(letras2);
         
         if(Arrays.equals(letras1,letras2)){
             result= true;
         }
         return result;
    }
}
