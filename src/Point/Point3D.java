package Point;

import java.util.Arrays;

public class Point3D extends Point2D {
    protected float z;
    public float[] array;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        array = new float[]{x, y, z};
        return array;
    }


    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
