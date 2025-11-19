abstract class TwoDfigure{
    double dim1, dim2;
    TwoDfigure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double calculateArea();
}

class Rectangle extends TwoDfigure{
    Rectangle(double length, double breadth){
        super(length, breadth); // calls the parent class constructor
    }
    double calculateArea(){
        return dim1 * dim2;
    }
}

class Triangle extends TwoDfigure{
    Triangle(double base, double height){
        super(base, height); // calls the parent class constructor
    }
    double calculateArea(){
        return (dim1 * dim2) / 2;
    }
}


public class assg8C {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 15);
        System.out.println("area of rectangle : " + r.calculateArea());

        Triangle t = new Triangle(10, 15);
        System.out.println("area of triangle : " + t.calculateArea());
    }
}
