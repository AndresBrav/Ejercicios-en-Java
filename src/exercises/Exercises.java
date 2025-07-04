/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercises;

/**
 *
 * @author Asus
 */
public class Exercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejercicios result = new Ejercicios();

        // Medir ResolucionOriginal
        long start1 = System.nanoTime();
        result.ResolucionOriginal();
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;
        System.out.println("Tiempo ResolucionOriginal: " + duration1 + " ns (" + (duration1 / 1_000_000.0) + " ms)\n");

        // Medir ResolucionMejorada
        long start2 = System.nanoTime();
        result.ResolucionMejorada();
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;
        System.out.println("Tiempo ResolucionMejorada: " + duration2 + " ns (" + (duration2 / 1_000_000.0) + " ms)");
    }

}
