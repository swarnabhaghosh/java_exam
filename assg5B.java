// An automorphic number is the number which contained in last digit(s) of its square. Example 25 is an automorphic number as its square is 625 and 25 is present as the last two digits. Print all automorphic numbers within range 11 to 40

import java.util.Scanner;

public class assg5B {
    public static void main(String[] args) {
        // int x= 11;
        // int y = 400;
        // for(int i = x; i <= y; i++){
        //     int square = i * i;
        //     if(square % 100 == i){
        //         System.out.println(i);
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i = x; i <= y; i++){
            int num = i, len = 0;
            while(num > 0){
                len++;
                num /= 10;
            }
            double conv = Math.pow(i, 2);
            if(conv % Math.pow(10, len) == i){
                System.out.println(i);
            }
        }
    }
}
