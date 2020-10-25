package i.ex2;

public class Rectangle extends Shape {
    private int length,width;

    public Rectangle(String color , int lenght , int width){
        super(color);
        this.length = lenght;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
    }

    @Override
    public double getArea() {
        return length*width;
    }

}
