// Write a java program to swap two variables with and without using third variable.

public class assg2A {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // with 3rd var

        System.out.println("before swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // without 3rd var

        System.out.println("before swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swapping :");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
