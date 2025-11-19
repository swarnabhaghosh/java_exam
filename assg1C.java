// Using command line argument write a java program to print Object Oriented Programming Using Java.

public class assg1C {
    public static void main(String[] args) {
        int len = args.length;

        System.out.println("no. of args = " + len);

        for(String x : args){
            System.out.println(x);
        }
    }
}
