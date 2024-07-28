package DECIMAL_TO_BINARIO;

/**
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan
 * directamente.
 * 
 * @author Juan Vázquez
 */

public class Main {
    public static void main(String[] args) {

        int number = 20;
        String binaryNumber = "";

        while (number >= 1) {
            if (number % 2 == 0) {
                binaryNumber += "0";
            } else {
                binaryNumber += "1";
            }
            number = number / 2;
        }

        String binaryNumberRevert = "";
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {

            binaryNumberRevert = binaryNumberRevert + binaryNumber.charAt(i);
        }

        System.out.println(binaryNumberRevert);
    }
}