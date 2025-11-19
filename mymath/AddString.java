package mymath;

public class AddString implements AddMul {
    private String s1, s2, result;

    public AddString(String s1, String s2) {
        this.s1 = s1; this.s2 = s2;
    }

    @Override
    public void add() {
        result = s1 + s2;  // concatenate
    }

    @Override
    public void show() {
        System.out.println("String concatenation: " + result);
    }
}
