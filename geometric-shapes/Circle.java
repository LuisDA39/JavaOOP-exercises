public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calcArea() {
        area = Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Radius: " + radius + "\n" +
                "Area: " + area;
    }
}
