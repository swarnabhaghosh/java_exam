import java.util.Scanner;


// Create a class with 2 instance variables say integer a & integer b. Create a method add that will copy value of instance variables into some local variables c & d. Then the method will sleep for 0.5 seconds, add their values (a & b) and print it. Create another method increase that will increase the value of a & b by 5 each, wait for 0.5 seconds and print their values.

class ThreadDemo{
    int a;
    int b;
    ThreadDemo(int a, int b){
        this.a = a;
        this.b = b;
    }

    void add(){
        int c = a;
        int d = b;
        try{
            Thread.sleep(500);
        }catch(Exception e){}
        int sum = c + d;
        System.out.println("sum = " + sum);
    }

    void increase(){
        a += 5;
        b += 5;
        try{
            Thread.sleep(500);
        }catch(Exception e){}
        System.out.println("a after being increased = " + a);
        System.out.println("b after being increased = " + b);
    }
}

// Create <two different threads to perform these 2 tasks> , invoke the add thread first.

public class assg10B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a =sc.nextInt();
        int b=sc.nextInt();

        ThreadDemo ob = new ThreadDemo(a,b);

        Runnable add = new Runnable(){ //this will do the same as implements Runnable
            public void run(){
                ob.add();
            }
        }; //making runnable object to run it in thread
        Thread thread1 = new Thread(add);

        Runnable increase = new Runnable(){ //this will do the same as implements Runnable
            public void run(){
                ob.increase();
            }
        }; //making runnable object to run it in thread
        Thread thread2 = new Thread(increase);

        thread1.start();
        thread2.start();   
    }   
}