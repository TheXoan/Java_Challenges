package AREA_POLIGONO;

public class Square implements Polygon {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void printArea() {
        System.out.println("El área del cuadrado es: " + area());
    }

}