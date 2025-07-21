/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DH_Ejercicios;

/**
 *
 * @author Asus
 */
public class ContarFrecuencia {

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 4, 1, 3, 5, 3};
        boolean[] procesado = new boolean[arreglo.length]; // Para marcar números ya contados

        // Recorrer el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            // Si el número ya fue procesado, lo saltamos
            if (procesado[i]) {
                continue;
            }

            int conteo = 0;
            // Contar cuántas veces aparece el número actual
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    conteo++;
                    procesado[j] = true; // Marcar como procesado
                }
            }

            // Imprimir el resultado para el número actual
            System.out.println("El número " + arreglo[i] + " se repite " + conteo + " veces");
        }

    }
}
