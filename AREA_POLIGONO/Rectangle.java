package AREA_POLIGONO;

public class Rectangle implements Polygon {

    private double length;
    private double weight;

    public Rectangle(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    @Override
    public double area() {
        return length * weight;
    }

    @Override
    public void printArea() {
        System.out.println("El área del rectángulo es: " + area());
    }
}