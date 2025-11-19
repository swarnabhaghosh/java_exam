// Write a java program to calculate y = x^n, where x and n are user inputs, using loop.
import java.util.*;

public class assg4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter x and n : ");
        int x = sc.nextInt();
        int n = sc.nextInt();

        int res = 1;

        for(int i = 1; i <= n; i++){
            res = res * x;
        }

        System.out.println("result = " + res);
    }
}
