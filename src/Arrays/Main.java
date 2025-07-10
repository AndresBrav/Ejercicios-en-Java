/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Asus
 */
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        List<Integer> nombres = new ArrayList<>();
        //nombres.add(5);
        //nombres.add(4);
        //nombres.add(3);

        //nombres.forEach((x) -> System.out.println(x));

        Map<Integer, String> dosValores = new HashMap<>();
        dosValores.put(1, "hola");
        dosValores.put(2, "Como");
        dosValores.put(3, "Estas");

        //System.out.println(dosValores.entrySet());
        System.out.println(dosValores.keySet());
        for (Map.Entry<Integer, String> entrada : dosValores.entrySet()) { //dosValores.keySet()
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }
        
        
        //Pilas
         // Crear una pila de enteros
        Stack<Integer> pila = new Stack<>();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Mostrar la pila
        System.out.println("Contenido de la pila: " + pila);

        // Ver el tope sin eliminarlo
        System.out.println("Elemento en el tope (peek): " + pila.peek());

        // Sacar un elemento
        int eliminado = pila.pop();
        System.out.println("Elemento eliminado (pop): " + eliminado);

        // Mostrar la pila actual
        System.out.println("Pila después del pop: " + pila);

        // Verificar si está vacía
        System.out.println("¿Está vacía la pila? " + pila.isEmpty());
    }
}
