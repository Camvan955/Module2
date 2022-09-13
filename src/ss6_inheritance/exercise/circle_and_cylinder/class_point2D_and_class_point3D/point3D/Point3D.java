package ss6_inheritance.exercise.circle_and_cylinder.class_point2D_and_class_point3D.point3D;

import ss6_inheritance.exercise.circle_and_cylinder.class_point2D_and_class_point3D.point2D.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return  String.format("(%.1f, %.1f, %.1f)",getX(),getY(),getZ());
    }
}
