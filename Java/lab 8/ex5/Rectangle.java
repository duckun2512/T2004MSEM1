package g.ex5;

public class Rectangle extends Shape {
    private double width,length;

    public Rectangle() {
        super();
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(String color, boolean filled, double side, double v) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle[Shape=" + super.toString()
                + ",width=" + width + ",length=" + length + "]";
    }
}
