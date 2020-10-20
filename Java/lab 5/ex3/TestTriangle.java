package ss5.ex3;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(0, 0, 3, 0 ,0, 3);
        Triangle tri2 = new Triangle(new MyPoint(1, 3), new MyPoint(3, 5), new MyPoint(4, 6));

        System.out.println(tri1);
        System.out.println(tri2);

        System.out.println("Perimeter of tri1 is: " + tri1.getPerimeter());
        System.out.println("Perimeter of tri2 is: " + tri2.getPerimeter());

        System.out.println("Type of tri1: " + tri1.getType());
        System.out.println("Type of tri2: " + tri2.getType());
    }
}
