abstract class GeometricObject {
    String color;
    double weight;
    GeometricObject(){
        color = "White";
        weight = 0.1;
    }

    String getColor(){
        return color;
    }

    double getWeight(){
        return weight;
    }

    abstract double findArea();
    abstract double findCircumference();
}

class Triangle extends GeometricObject{
    double a, b, c;
    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double findArea(){
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    double findCircumference(){
        return a + b + c;
    }
}

public class assg8D {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Color: " + t.getColor());
        System.out.println("Weight: " + t.getWeight());
        System.out.println("Area: " + t.findArea());
        System.out.println("Circumference: " + t.findCircumference());
    }
}
