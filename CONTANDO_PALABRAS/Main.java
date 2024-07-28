package CONTANDO_PALABRAS;

import java.util.HashMap;
import java.util.Map;

/**
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 * lo resuelvan automáticamente.
 * 
 * @author Juan Vázquez
 */

public class Main {
    public static void main(String[] args) {

        String text = "El gato jugaba en el jardin, saltando de rama en rama. El jardin era su lugar favorito para explorar. Explorar le daba alegria y alegria a su dia.";
        System.out.println(text);

        Map<String, Integer> wordCount = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z0-9],[\\s]", " ");
        text = text.replaceAll("[\\.\\,]", "");

        String[] palabras = text.split(" ");

        for (int i = 0; i < palabras.length; i++) {

            if (wordCount.containsKey(palabras[i])) {
                Integer valor = wordCount.get(palabras[i]);
                valor++;
                wordCount.put(palabras[i], valor);
            } else {
                wordCount.put(palabras[i], 1);
            }

        }

        System.out.println(wordCount);

    }
}