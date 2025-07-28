/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio19;

import java.util.ArrayList;

/**
 *
 * @author Andres Bravo
 */
/*
 * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 * y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
 *   O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta.
 * Se podría representar con un vacío "", por ejemplo.
 */
public class Main {

    public static void main(String[] args) {
        String[][] tablero = new String[3][3];
        tablero[0][0] = "X";
        tablero[0][1] = "X";
        tablero[0][2] = "";

        tablero[1][0] = "O";
        tablero[1][1] = "O";
        tablero[1][2] = "X";

        tablero[2][0] = "O";
        tablero[2][1] = "X";
        tablero[2][2] = "O";

        boolean x = revisarQuienGano(tablero, "X");
        boolean o = revisarQuienGano(tablero, "O");

        System.out.println("El resultado final es " + ImprimirResultado(x, o));

    }

    public static String ImprimirResultado(boolean jugadorX, boolean jugadorO) {
        if (jugadorX == true && jugadorO == false) {
            return "X";
        } else if (jugadorX == false && jugadorO == true) {
            return "O";
        } else if (jugadorX == false && jugadorO == false) {
            return "Empate";
        } else {
            return "Nulo";
        }
    }

    public static boolean revisarQuienGano(String[][] tablero, String signo) {

        ArrayList<Boolean> resultados = new ArrayList();

        for (int i = 0; i < 3; i++) {
            boolean resultFila = verificarFilas(tablero, signo, i);
            resultados.add(resultFila);
            boolean resultColumna = verificarColumnas(tablero, signo, i);
            resultados.add(resultColumna);
        }

        boolean diagonales = verificarDiagonales(tablero, signo);
        resultados.add(diagonales);

        boolean analizar = AnalizarResultados(resultados);

        return analizar;
    }

    public static boolean verificarDiagonales(String[][] tablero, String signo) {
        boolean diagonal1 = signo.equals(tablero[0][0]) && signo.equals(tablero[1][1]) && signo.equals(tablero[2][2]);
        boolean diagonal2 = signo.equals(tablero[2][0]) && signo.equals(tablero[1][1]) && signo.equals(tablero[0][2]);
        boolean result = diagonal1 || diagonal2;
        return result;
    }

    public static boolean AnalizarResultados(ArrayList<Boolean> resultados) {
        boolean fila1 = resultados.get(0);
        boolean columna1 = resultados.get(1);
        boolean fila2 = resultados.get(2);
        boolean columna2 = resultados.get(3);
        boolean fila3 = resultados.get(4);
        boolean columna3 = resultados.get(5);
        boolean diagonales = resultados.get(6);
        boolean result = fila1 || fila2 || fila3 || columna1 || columna2 || columna3 || diagonales;
        return result;
    }

    public static boolean verificarFilas(String[][] tablero, String signo, int fila) {
        boolean result = true;
        int columna = 0;
        while (columna < 3) {
            String dato = tablero[fila][columna];

            if (signo.equals(dato) == false) {
                result = false;
                break;
            }

            columna++;
        }

        return result;
    }

    public static boolean verificarColumnas(String[][] tablero, String signo, int columna) {
        boolean result = true;
        int fila = 0;
        while (fila < 3) {
            String dato = tablero[fila][columna];

            if (signo.equals(dato) == false) {
                result = false;
                break;
            }

            fila++;
        }

        return result;
    }

}
