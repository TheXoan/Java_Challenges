package CODIGO_MORSE;

import java.util.HashMap;
import java.util.Map;

/**
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 * la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 * o símbolos y dos espacios entre palabras " ".
 * - El alfabeto morse soportado será el mostrado en
 * https://es.wikipedia.org/wiki/Código_morse.
 * 
 * @author Juan Vázquez
 */

public class Main {
    public static void main(String[] args) {

        Map<String, String> alphabet = new HashMap<>();

        alphabet.put("A", ".-");
        alphabet.put("B", "-...");
        alphabet.put("C", "-.-.");
        alphabet.put("CH", "----");
        alphabet.put("D", "=..");
        alphabet.put("E", ".");
        alphabet.put("F", "..-.");
        alphabet.put("G", "--.");
        alphabet.put("H", "....");
        alphabet.put("I", "..");
        alphabet.put("J", ".---");
        alphabet.put("K", "-.-");
        alphabet.put("L", ".-..");
        alphabet.put("M", "--");
        alphabet.put("N", "-.");
        alphabet.put("Ñ", "--.--");
        alphabet.put("O", "---");
        alphabet.put("P", ".--.");
        alphabet.put("Q", "--.-");
        alphabet.put("R", ".-.");
        alphabet.put("S", "...");
        alphabet.put("T", "-");
        alphabet.put("U", "..-");
        alphabet.put("V", "...-");
        alphabet.put("W", ".--");
        alphabet.put("X", "-..-");
        alphabet.put("Y", "-.--");
        alphabet.put("Z", "--..");
        alphabet.put("0", "-----");
        alphabet.put("1", ".----");
        alphabet.put("2", "..---");
        alphabet.put("3", "...--");
        alphabet.put("4", "....-");
        alphabet.put("5", ".....");
        alphabet.put("6", "-....");
        alphabet.put("7", "--...");
        alphabet.put("8", "---..");
        alphabet.put("9", "----.");
        /**
         * alphabet.put(".",".-.-.-");
         * alphabet.put(",","--..--");
         * alphabet.put("?","..--..");
         * alphabet.put("\"",".-..-.");
         * alphabet.put("\\/","-..-.");
         **/

    }
}