import java.util.Scanner;

abstract class Number{
    abstract void displayNum(int n);
}

class HexNum extends Number{
    void displayNum(int n){
        int r, num = n;
        String s = "";
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F'};
        while(num > 0){
            r = num % 16;
            s = hex[r] + s;
            num = num / 16;
        }
        System.out.println("Hexadecimal Value of " + n + " is " + s);
    }
}

class OctalNum extends Number{
    void displayNum(int n){
        int r, num = n;
        String s = "";
        char oct[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while(num > 0){
            r = num % 8;
            s = oct[r] + s;
            num = num / 8;
        }
        System.out.println("Octal Value of " + n + " is " + s);
    }
}


public class assg8B {
    public static void main(String[] args) {
        HexNum hex = new HexNum();
        hex.displayNum(16);

        OctalNum octal = new OctalNum();
        octal.displayNum(16);
    }
}
