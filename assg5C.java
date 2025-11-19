// A number is said to be a special number, if the sum of the factorial of the digits of a number is same as the original number. Example-145 is a special number, because 1! + 4! + 5! =145. Print all special numbers within range 100 to 999.

public class assg5C {
    int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        assg5C obj = new assg5C();
        for(int num = 100; num <= 100000; num++){
            int dummy = num, sum = 0;
            while(dummy > 0){
                sum += obj.factorial(dummy % 10);
                dummy /= 10;
            }
            if(sum == num){
                System.out.println(num + " is special number");
            }
        }
        
    }
}
