import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius=radius;
    }

    double calculateArea() {
        return Math.PI *radius*radius;
    }
}

class Square {
    double side;

    Square(double side) {
        this.side =side;
    }

    double calculateArea() {
        return side*side;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();

        Circle c = new Circle(r);
        Square sq = new Square(s);

        System.out.println("Area of Circle: " +c.calculateArea());
        System.out.println("Area of Square: " +sq.calculateArea());
    }
}
