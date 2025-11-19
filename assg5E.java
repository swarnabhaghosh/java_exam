public class assg5E {
    int rotate(int num){
        String s = Integer.toString(num);
        s = s.substring(1) + s.charAt(0);
        int n = Integer.parseInt(s);
        return n;
    }

    boolean isPrime(int num){
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        assg5E obj = new assg5E();
        int num = 31;
        int dummy = num;
        int len = Integer.toString(num).length();
        boolean flag = true;

        for(int i = 1; i <= len; i++){
            dummy = obj.rotate(dummy);
            if(!obj.isPrime(dummy)) flag = false;
        }

        if(flag){
            System.out.println(num + " is circular prime");
        }else{
            System.out.println("not prime");
        }
    }
}
