package ss6_inheritance.bai_tap.point_movable_point;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point() {
    }

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{getX(), getY()};
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
