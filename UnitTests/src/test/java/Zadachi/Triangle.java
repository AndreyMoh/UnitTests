package Zadachi;

public class Triangle {

    public int a;
    public int b;
    public int c;

    public Triangle(int a, int b, int c) {

        if (a + b > c && b + c > a && a + c > b) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("No triangle");
        }
    }
    public double triangleArea() {
        double pp = (a + b + c) / 2.0;  // полупериметр
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    public double triangleSquare() {
        return (a + b + c);
    }

    public void info() {
        System.out.format("a = ", a);
        System.out.format("b = ", b);
        System.out.format("c = ", c);

        double pp = (a + b + c) / 2.0;  // полупериметр
        System.out.println(Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));

        System.out.format("P = ", (a + b + c));
    }
}
