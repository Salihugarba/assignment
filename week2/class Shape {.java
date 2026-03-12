class Shape {
    double area(){
        return 0;
    }
}
class Circle extends Shape {
    double radius = 7;

    double area() {
        return Math * radius * radius;
    }
}
class Rectangle extends Shape {
    double length = 5;
    double width = 4;

    double area() {
        return length * width
    }
}
class Triangle extends Shape {
    double base = 6;
    double height = 3;

    double area() {
        return 0.5 * base * height;

    }
}
class TestShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}

