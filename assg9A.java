import java.util.Scanner;

public class assg9A {
    public static void main(String[] args) {
        // try{
        //     double res;
        //     res = 10 / 0;
        // }catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        // }

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();
            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den; 
            System.out.println("Result: " + result);
        }catch(ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Origin of exception: Division by zero is not allowed!");
        }
        sc.close();
    }
}
