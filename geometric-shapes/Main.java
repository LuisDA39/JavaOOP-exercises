public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5, 3);
        System.out.println("--- Triangle ---");
        triangle.calcArea();
        System.out.println(triangle + "\n");

        Square square = new Square(5, 5);
        System.out.println("--- Square ---");
        square.calcArea();
        square.calcPerimeter();
        System.out.println(square + "\n");

        Circle circle = new Circle(20);
        System.out.println("--- Circle ---");
        circle.calcArea();
        System.out.println(circle);
    }
}
