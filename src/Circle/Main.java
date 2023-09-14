package Circle;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, "black", 4);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.cicleToString());
    }
}
