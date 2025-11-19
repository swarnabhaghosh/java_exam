public class assg7B {
    // SAD
    // SDA
    // ASD
    void TowerOfHanoi(int n, String Source, String Auxiliary, String Destination){
        if(n == 1){
            System.out.println("Move Disk 1 from " + Source + " to " + Destination);
            return;
        }

        TowerOfHanoi(n-1, Source, Destination, Auxiliary);
        System.out.println("Move Disk " + n + " from " + Source + " to " + Destination);
        TowerOfHanoi(n-1, Auxiliary, Source, Destination);
    }
    public static void main(String[] args) {
        assg7B obj = new assg7B();
        obj.TowerOfHanoi(3, "A", "B", "C");
    }
}
