public class assg5Aiii {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            int x = 1;
            for(int k = i; k <= 5; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(x++);
            }
            System.out.println();
        }
    }
}
