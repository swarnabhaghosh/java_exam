package mymath;

public class AddInt implements AddMul {
    private int a, b, result;

    public AddInt(int a, int b) {
        this.a = a; this.b = b;
    }

    @Override
    public void add() {
        result = a + b;
    }

    @Override
    public void show() {
        System.out.println("Integer sum: " + result);
    }
}
