//composite magic number

public class assg5D {
    boolean isComposite(int n){
        if(n <= 3) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return true;
        }
        return false;
    }

    int digitSum(int n){
        int num = n;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    boolean isMagic(int n){
        while(n > 9){
            n = digitSum(n);
        }
        return n == 1;
    }


    public static void main(String[] args) {
        assg5D obj = new assg5D();
        for(int i = 1; i <= 100; i++){
            if(obj.isComposite(i) && obj.isMagic(i)){
                System.out.println(i);
            }
        }
    }
}
