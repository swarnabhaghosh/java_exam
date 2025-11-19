// Write a program to check a given number is a magic number or not. A number is said to be a Magic number if the sum of its digits are calculated till a single digit is obtained by recursively adding the sum of its digits. If the single digit comes to be 1 then the number is a magic number. Example- 199 is a magic number as 1+9+9=19 but 19 is not a single digit number so 1+9=10 and then 1+0=1 which is a single digit number and also 1. Hence it is a magic number. Print all the magic numbers within a given range.


public class assg4E {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        for(int i = x; i <= y; i++){
            int num = i;
            while(num > 9){
                int sum = 0;
                while(num > 0){
                    sum += num % 10;
                    num = num / 10;
                }
                num = sum;
            }
            if(num == 1){
                System.out.println(i);
            }
        }
    }
}
