public class assg5Aii {
    public static void main(String[] args) {
        int x = 65;
        for(int i = 1; i <= 5; i++){
            for(int k = i; k <5; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print((char)(x++) + " ");
            }
            System.out.println();
        }
    }
}
