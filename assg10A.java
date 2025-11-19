// Create two threads. One will print from 1 to 10. Another will print 10 to 1. In the second thread if value is 6 it will sleep for 10000 milliseconds.

class Thread1 extends Thread{
    public void run(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Thread1 : " + i);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 10; i >= 1; i--){
            System.out.println("Thread2 : " + i);
            if(i == 6){
                try{
                    sleep(10000);
                }catch(Exception e){
                }
            }
        }
    }
}

public class assg10A {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}

