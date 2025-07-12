
import java.util.ArrayList;
import java.util.List;

public class Limbert {
    
    public static void main(String[] args){
        /*System.out.println("EJERCICIO 2");
        System.out.println(signos("{[a*(c+d)]-5}"));
        System.out.println(signos("{a*(c+d)]-5}"));
        System.out.println(signos("{ ( ) [ a * ( c + d)   - 5 }"));
        System.out.println(signos("{ ( ) [ a * ( c + d) - 5 }"));
        System.out.println("EJERCICIO 2");*/
        //ana lleva al oso la avellana.
        System.out.println(esPalindrono("ana lleva al oso, la avellanA."));
        
        System.out.println(esPalindrono("Ana lleva al os la avellana."));
    }
    
    private static boolean esPalindrono(String frase){
        frase = frase.toLowerCase();
        String aa = " .,";
        int i = 0;
        int j = frase.length()-1;
        boolean cumple = false;
        while(cumple == false){
            if(i >= j){
                cumple = true;
            }else{
                char a = frase.charAt(i);
                char b = frase.charAt(j);
                if(aa.indexOf(a) >= 0){
                    j++;
                }else if(aa.indexOf(b) >= 0){
                    i--;
                }
                j--;
                i++;
            }
        }
        
        cumple = i == j;
        return cumple;
    }

    public static boolean signos(String palabra) {
        List<Integer> arreglo = new ArrayList<>();
        //"{ ( ) [ a * ( c + d)  ] - 5 }")
        
        
        //[([)
        
        char[] a = {'(', '{', '¿', '['};
        char[] c = {')', '}', '?', ']'};
        boolean cumple = true;
        for (int i=0;i<palabra.length() && cumple == true; i++) {
            char caracter = palabra.charAt(i);
            int indexA = verificar(caracter, a);
            if(indexA >= 0){
                arreglo.add(indexA);
            }else{
                int indexB = verificar(caracter, c);
                if(indexB >= 0){
                    if(arreglo.getLast() == indexB){
                        arreglo.removeLast();
                    }else{
                        cumple = false;
                    }
                }
            }
        }
        
        return arreglo.isEmpty();
    }

    private static int verificar(char c, char[] a) {
        int index = -1;
        for(int i=0;i<a.length && index == -1 ;i++){
            if(a[i] == c){
                index = i;
            }
        }
        return index;
    }
}