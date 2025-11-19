public class assg9B {
    public static void main(String[] args){
        int[] arr = new int[10];
        try {
            System.out.println("Assigning value at index 15");
            arr[15] = 100; 
            System.out.println("Value assigned successfully!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            throw e; // Re-throwing the exception
        } 
        catch (Exception e) {
            System.out.println("Caught a general Exception: " + e.getMessage());
        }
    }
}