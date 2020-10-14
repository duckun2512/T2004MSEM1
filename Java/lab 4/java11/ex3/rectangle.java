package ex3;

public class rectangle {
    private float length;
    private float width;

    public void Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public void Rectangle(float l, float w) {
        length = l;
        width = w;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float l) {
        this.length = l;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float w) {
        this.width = w;
    }

    public double getArea() {
        return length*width;
    }

    public double getPerimeter() {
        return (length+width)*2;
    }

    public String toString() {
        return "Rectangle[length=" + length + " width=" + width + "]";
    }
}
