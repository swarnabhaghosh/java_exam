import mymath.*;

public class assg11A {
    public static void main(String[] args) {
        AddInt ai = new AddInt(10, 20);
        ai.add();
        ai.show();

        AddDouble ad = new AddDouble(3.14, 2.86);
        ad.add();
        ad.show();

        AddString as = new AddString("Hello, ", "World!");
        as.add();
        as.show();
    }
}
