package ss6;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();

        System.out.println("Radius is "+cy1.getRadius()
                + ",Height is " + cy1.getHeight()
                + ",Color is " + cy1.getColor()
                + ",base Area is "+ cy1.getArea()
                + ",volume is "+ cy1.getVolume());
    }
}
