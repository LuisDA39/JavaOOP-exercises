public class Square extends FigureBH {

    public Square(double base, double height) {
        super(base, height);
    }

    public void calcArea() {
        area = base * height;
    }

    public void calcPerimeter() {
        perimeter = base * 2 + height * 2;
    }
}
