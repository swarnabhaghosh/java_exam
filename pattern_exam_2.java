import java.util.Scanner;

public class pattern_exam_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter value of n (e.g., 5 for E, 26 for Z): ");
        int n = scanner.nextInt();

        // Validation (Optional but good practice)
        if (n < 1 || n > 26) {
            System.out.println("Please enter a number between 1 and 26.");
        } else {
            // Outer loop for rows
            for (int i = 0; i < n; i++) {
                
                // Calculate the limit character for the current row.
                // Row 0: 'A' + (n-1) - 0
                // Row 1: 'A' + (n-1) - 1, etc.
                char currentLimit = (char) ('A' + (n - 1) - i);

                // 1. Print Left Letters (A -> Limit)
                for (char c = 'A'; c <= currentLimit; c++) {
                    System.out.print(c + " "); // added space for readability, remove if needed
                }

                // 2. Print Spaces
                // The gap increases by 4 spaces per row if we use spaces between letters,
                // or 2 spaces per row if letters are tight.
                // Here we assume 2 spaces per missing letter position.
                for (int s = 0; s < (4 * i); s++) { 
                    System.out.print(" ");
                }

                // 3. Print Right Letters (Limit -> A)
                for (char c = currentLimit; c >= 'A'; c--) {
                    System.out.print(c + " ");
                }

                // Move to the next line
                System.out.println();
            }
        }
        
        scanner.close();
    }
}