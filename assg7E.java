class Draw {
    // square
    void rect(int n, char ch) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // rectangle
    void rect(int l, int b, char ch) {
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

public class assg7E {
    public static void main(String[] args) {
        Draw d = new Draw();

        d.rect(5, '#');      // square
        System.out.println();
        d.rect(3, 7, '*');   // rectangle
    }
}
