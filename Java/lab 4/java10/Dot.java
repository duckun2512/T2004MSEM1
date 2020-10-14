public class Dot {
    public class Circle {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());

        c2.radius = 5.0;
        c2.color = "blue";
    }
}
