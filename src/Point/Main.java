package Point;

public class Main {
    public static void main(String[] args) {
        Point3D point = new Point3D();
        point.setXYZ(2,3,5);
        System.out.println(point.getXYZ());
        System.out.println(point.toString());
    }
}
