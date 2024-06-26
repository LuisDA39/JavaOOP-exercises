public class Triangle extends FigureBH {

    public Triangle(double base, double height) {
        super(base, height);
    }

    public void calcArea() {
        area = (base * height) / 2;
    }
}
