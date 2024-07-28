package INVIRTIENDO_CADENAS;

import java.util.Scanner;
import java.util.Stack;

/**
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 * 
 * @author Juan Vázquez
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Character> pila = new Stack<Character>();

        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();

        char[] letras = frase.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            pila.add(letras[i]);
        }

        String reversePhrase = "";
        while (!pila.isEmpty()) {
            reversePhrase += pila.pop();
        }

        System.out.println(reversePhrase);

        sc.close();
    }
}