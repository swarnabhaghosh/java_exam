// Write a java program which will take radius of a Circle as user input and calculate area and perimeter to display the results.

import java.util.Scanner;

public class assg1B {
    public static void main(String[] args) {
        float r;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        r = sc.nextFloat();

        double pi = 3.14;

        double perimeter = 2 * pi * r;
        double area = pi * r * r;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
