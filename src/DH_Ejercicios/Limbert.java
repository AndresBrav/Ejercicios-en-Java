/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DH_Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Limbert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int univ = sc.nextInt();
        int[] rester = new int[univ];
        for (int i = 0; i < univ; i++) {
            int sist = sc.nextInt();
            int[] myNum = new int[sist];
            for (int j = 0; j < sist; j++) {
                myNum[j] = sc.nextInt();
            }
            rester[i] = sistemaSolar(myNum);

        }
        System.out.println("RESPUESTA");
        for (int i = 0; i < rester.length; i++) {
            System.out.println(rester[i]);
        }
    }

    private static int sistemaSolar(int[] myNum) {
        //13,27,2222222
        List<Integer>[] arreglo = new ArrayList[myNum.length];

        for (int i = 0; i < myNum.length; i++) {
            arreglo[i] = divisores(myNum[i]);
        }

        /*
            33333
        33333
        
            12,6,
            26,,3,3,,3,
        eeeee
         */
        int cont = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            List<Integer> aux = arreglo[i];
            while (!aux.isEmpty()) {
                int ali = aux.removeLast();
                //int cont = 0;
                for (int j = i + 1; j < arreglo.length; j++) {
                    boolean flag = arreglo[j].remove(Integer.valueOf(ali));
                    if (flag == true) {
                        cont++;
                        //res.put(ali, cont);
                        //System.out.println(ali);
                    }
                }
                //if(arreglo[j].remove(Integer.valueOf(ali))){
                //}
            }

        }
        return cont;
    }

    /* 12 1
        6  2  
        4   3
     */
    private static List<Integer> divisores(int numero) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(numero);
        int div = 2;
        while (lista.getLast() > div) {
            if (numero % div == 0) {
                //System.out.println(numero);
                lista.add(div);
                lista.add(numero / div);
            }
            div++;
        }
        return lista;
    }
}
