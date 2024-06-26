public class FigureBH extends Figure {
    double base;
    double height;

    public FigureBH(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Base: " + base + "\n" +
                "Height: " + height + "\n" +
                "Area: " + area;
    }
}
