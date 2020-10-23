package g.ex5;

public class Square extends Rectangle {
    double side;

    public Square() {
        super();
        side = 1.0;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled,side,side);
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public double getPerimeter() {
        return (side+side)*2;
    }

    public String toString() {
        return "Square[" + super.toString() + ",side=" + side + "]";
    }
}
