// Write a java program to generate Fibonacci Series up-to n terms using loop.

public class assg4B {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int n = 10;

        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
