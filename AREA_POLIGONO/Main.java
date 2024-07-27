package AREA_POLIGONO;

/**
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 * 
 * @author Juan Vázquez
 */

public class Main {

    public static void main(String[] args) {

        area(new Triangle(10.0, 5.0));
        area(new Rectangle(5.0, 7.0));
        area(new Square(4.0));
    }

    private static double area(Polygon poligono) {
        poligono.printArea();
        return poligono.area();
    }
}