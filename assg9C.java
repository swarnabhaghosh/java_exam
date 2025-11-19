public class assg9C {
    public static void main(String[] args) {
        String str = null; 
        try {
            System.out.println("String length is: " + str.length()); 
        } 
        catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Origin: Trying to use a null reference!");
        } 
        finally {
            System.out.println("Finally block executed: Closing resources or cleaning up.");
        }
    }
}