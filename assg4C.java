// Write a java program to generate all Prime Numbers within a range, where range is user input.

public class assg4C {
    public static void main(String[] args) {
        int x = 2; 
        int y = 100;

        for(int i = x; i <= y; i++){
            boolean isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
