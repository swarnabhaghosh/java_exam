package mymath;

public class AddDouble implements AddMul {
    private double a, b, result;

    public AddDouble(double a, double b) {
        this.a = a; this.b = b;
    }

    @Override
    public void add() {
        result = a + b;
    }

    @Override
    public void show() {
        System.out.println("Double sum: " + result);
    }
}
