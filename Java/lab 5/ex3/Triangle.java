package ss5.ex3;

public class Triangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return String.format("MyTriangle[v1=%s,v2=%s,v3=%s]",
                v1.toString(), v2.toString(), v3.toString());
    }

    public double getPerimeter() {
        double edge1, edge2, edge3;
        edge1 = v1.distance(v2);
        edge2 = v2.distance(v3);
        edge3 = v3.distance(v1);
        return  edge1 + edge2 + edge3;
    }

    public String getType() {
        double edge1, edge2, edge3;
        String testType;
        edge1 = v1.distance(v2);
        edge2 = v2.distance(v3);
        edge3 = v3.distance(v1);
        if ((edge1 == edge2) && (edge1 == edge3)) {
            testType = "Equilateral";
        } else if ((edge1 == edge2) || (edge1 == edge3) || (edge2 == edge3)) {
            testType = "Isosceles";
        } else testType = "Scalene";
        return testType;
    }
}
