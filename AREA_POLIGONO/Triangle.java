package AREA_POLIGONO;

public class Triangle implements Polygon {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public void printArea() {
        System.out.println("El área del triángulo es: " + area());
    }

}