package Circle;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    public String cicleToString() {
        return super.toString();
    }
}
