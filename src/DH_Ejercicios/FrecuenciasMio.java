/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DH_Ejercicios;

/**
 *
 * @author Asus
 */
public class FrecuenciasMio {

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 4, 1, 3, 5, 3};
        boolean[] procesado = new boolean[arreglo.length]; // Para marcar números ya contados
        //System.out.println(procesado[0]);

        for (int i = 0; i < arreglo.length; i++) {
            int numero = arreglo[i];

            int suma = 0;
            for (int j = 0; j < arreglo.length; j++) {
                int comparacion = arreglo[j];

                if (numero == comparacion) {
                    suma++;
                    procesado[j] = true;
                }

            }

            System.out.println("el numero " + numero + " se repite " + suma);

        }
    }
}
