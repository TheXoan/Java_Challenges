package SUCESION_FIBONACCI;

/**
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 * la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 * 
 * @author Juan Vázquez
 */

public class Main {

    public static void main(String[] args) {

        int iterador1 = 0;
        int iterador2 = 1;

        int fibonacci = 1;

        System.out.println(0);

        for (int i = 0; i <= 50; i++) {

            System.out.println(fibonacci);

            fibonacci = iterador1 + iterador2;
            iterador1 = iterador2;
            iterador2 = fibonacci;
        }
    }
}