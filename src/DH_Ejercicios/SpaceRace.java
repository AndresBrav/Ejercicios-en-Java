/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DH_Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres Bravo
 */
public class SpaceRace {

    public static void main(String[] args) {
        int numeroUniversos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de universos"));
        Map<Integer, List<Integer>> casosPrueba = new HashMap<>();

        for (int i = 0; i < numeroUniversos; i++) {
            int sistemas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de sistemas solares para el universo " + (i + 1)));

            List<Integer> estrellas = new ArrayList<>();

            for (int j = 0; j < sistemas; j++) {
                int estrella = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del sistema solar #" + (j + 1)));
                estrellas.add(estrella);
            }

            casosPrueba.put(i + 1, estrellas); // i representa el índice del universo sistemas
        }

        CalcularDivisores(casosPrueba);

        /*int clave = 1;
        List<Integer> soles = new ArrayList<>(Arrays.asList(13, 27, 12, 26));
        SacarTodosDivisores(clave, soles);*/
    }

    public static void CalcularDivisores(Map<Integer, List<Integer>> casosPrueba) {

        Map<Integer, List<Integer>> divisores = new HashMap<>();
        // Mostrar los resultados para verificar
        for (Map.Entry<Integer, List<Integer>> entrada : casosPrueba.entrySet()) {
            int clave = entrada.getKey();
            List<Integer> soles = entrada.getValue();
            SacarTodosDivisores(clave, soles);
        }
    }

    public static void SacarTodosDivisores(int clave, List<Integer> soles) {
        List<Integer> DivisoresDelSol = todosdivisores(soles);
        CalcularFrecuencia(DivisoresDelSol);
    }

    public static List<Integer> todosdivisores(List<Integer> soles) {
        List<Integer> divisores = new ArrayList<>();

        for (int i = 0; i < soles.size(); i++) {
            int sol = soles.get(i);
            for (int j = 1; j <= sol; j++) {
                if (sol % j == 0) {
                    divisores.add(j);
                }
            }
        }

        return divisores;
    }

    public static void CalcularFrecuencia(List<Integer> DivisoresDelSol) {
        Map<Integer, Integer> frecuencias = new HashMap<>();

        for (int i = 0; i < DivisoresDelSol.size(); i++) {
            int numero = DivisoresDelSol.get(i);
            frecuencias.put(numero, frecuencias.getOrDefault(numero, 0) + 1);
        }

        ImprimirFrecuencia(frecuencias);

    }

    public static void ImprimirFrecuencia(Map<Integer, Integer> frecuencias) {
        int sumaTotal = 0;

        for (Map.Entry<Integer, Integer> aux : frecuencias.entrySet()) {
            int numeroaux = aux.getValue() - 1;
            sumaTotal += numeroaux;
        }
        System.out.println(sumaTotal);
    }

}
