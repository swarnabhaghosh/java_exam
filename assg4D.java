// Write a java program to reverse a number and check whether it is a Palindrome.

public class assg4D {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 121;

        int new_num = 0;

        int dummy_num1 = num1; //creating dummy so that the original number dont change
        int dummy_num2 = num2;

        while(dummy_num1 != 0){
            int s = dummy_num1 % 10;
            new_num = new_num * 10 + s;
            dummy_num1 = dummy_num1 / 10;
        }

        System.out.println(num1);
        System.out.println(new_num);

        if(num1 == new_num){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
