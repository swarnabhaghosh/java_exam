class NonFibonacci{
    void printNonFibo(int n){
        int count = 0;
        int a = 1;
        int b = 2;
        while(count < n){
            int next = a + b;
            for(int i = b + 1; i < next && count < n; i++){
                System.out.println(i + " ");
                count++;
            }
            a = b;
            b = next;
            System.out.println("count = " + count);
        }
    }
}

public class assg7C {
    public static void main(String[] args) {
        NonFibonacci obj = new NonFibonacci();
        obj.printNonFibo(5);
    }
}
