package ANAGRAMA;

import java.util.Scanner;

/**
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 * las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 * 
 * @author Juan Vázquez
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime dos palabras y te diré si son anagramas");

        System.out.println("Dime la primera palabra");
        String palabra1 = sc.nextLine();

        System.out.println("Dime la segunda palabra");
        String palabra2 = sc.nextLine();

        int valorPalabra1 = 0;
        char[] letrasPalabra1 = palabra1.toCharArray();
        for (int i = 0; i < letrasPalabra1.length; i++) {
            valorPalabra1 = valorPalabra1 + (int) letrasPalabra1[i];
        }
        int valorPalabra2 = 0;
        char[] letrasPalabra2 = palabra2.toCharArray();
        for (int i = 0; i < letrasPalabra2.length; i++) {
            valorPalabra2 = valorPalabra2 + (int) letrasPalabra2[i];
        }

        if (valorPalabra1 == valorPalabra2 && !palabra1.equals(palabra2)) {
            System.out.println(palabra1 + " es un anagrama de " + palabra2);
        } else {
            System.out.println(palabra1 + " NO es un anagrama de " + palabra2);
        }

        sc.close();
    }
}