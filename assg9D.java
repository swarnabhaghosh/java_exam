import java.util.*;

class MathException extends Exception {
    MathException(String msg) {
        System.out.println("Math Exception: " + msg);
    }
}

class OverflowException extends MathException {
    OverflowException(String msg) {
        super(msg);
        System.out.println("Overflow Exception: " + msg);
    }
}

class UnderflowException extends MathException {
    UnderflowException(String msg) {
        super(msg);
        System.out.println("Underflow Exception: " + msg);
    }
}

class D {
    D(int x) {
        int num = x;
        try {
            if (num < 100) {
                try {
                    throw new UnderflowException("Number less than 100, UnderflowException thrown");
                } catch (UnderflowException e) {
                    System.out.println("catching UnderflowException and re-throwing");
                    throw e;
                }
            }
            else {
                try {
                    throw new OverflowException("Number greater than 100, OverflowException thrown");
                } catch (OverflowException e) {
                    System.out.println("catching OverflowException and re-throwing");
                    throw e;
                }
            }
        } catch (MathException e) {
            System.out.println("catching MathException");
            System.out.println("Exception: " + e);
        }
    }
}

public class assg9D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // new A();
        // new B(sc);
        // new C();
        D d = new D(x);
        sc.close();
    }
}