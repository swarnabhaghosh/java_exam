abstract class shape{
    int a, b;
    abstract void printArea(); 
}

class Rectangle extends shape {
    Rectangle(int x, int y) { 
        a = x; b = y; 
    }
    void printArea() { 
        System.out.println("Rectangle Area: " + (a * b)); 
    }
} 
class Triangle extends shape {
    Triangle(int x, int y) { 
        a = x; b = y; 
    }
    void printArea() { 
        System.out.println("Triangle Area: " + (0.5 * a * b)); 
    }
} 
class Circle extends shape {
    Circle(int x) { 
        a = x; 
    }
    void printArea() { 
            System.out.println("Circle Area: " + (3.14 * a * a)); 
    }
} 

public class assg8E {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.printArea();
        Triangle t = new Triangle(4, 8);
        t.printArea();
        Circle c = new Circle(6);
        c.printArea();
    }
}
