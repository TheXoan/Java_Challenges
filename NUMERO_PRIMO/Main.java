package NUMERO_PRIMO;

/**
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 * 
 * @author Juan Vázquez
 */

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (calcularPrimo(i)) {
                System.out.println(i + " es Primo");
            }
        }
    }

    public static boolean calcularPrimo(int numero) {

        boolean isPrimo = true;

        for (int i = 2; i <= (numero - 1); i++) {
            if (numero % i == 0) {
                isPrimo = false;
            }
        }
        return isPrimo;
    }
}