package ANAGRAMA;

import java.util.Scanner;

/**
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 * las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos palabras y te diré si son anagramas");

        System.out.println("Dime la primera palabra");
        String palabra1 = sc.nextLine();

        System.out.println("Dime la segunda palabra");
        String palabra2 = sc.nextLine();

        System.out.println(palabra1 + " " + palabra2);
    }
}
