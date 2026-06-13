import java.util.Scanner;
interface Shape {
    double calculateArea();
}
class Circle implements Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Square implements Shape {
    private double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter side of Square: ");
        double side = sc.nextDouble();
        Shape s1 = new Circle(radius);
        Shape s2 = new Square(side);
        System.out.println("\nArea of Circle: " + s1.calculateArea());
        System.out.println("Area of Square: " + s2.calculateArea());

        sc.close();
    }
}
