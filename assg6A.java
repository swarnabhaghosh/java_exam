import java.util.*;

public class assg6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in 1D array : ");
        int n = sc.nextInt();
        int[] arr1D = new int[n];
        System.out.println("Enter the elements in 1D array : ");
        for(int i = 0; i < n; i++){
            arr1D[i] = sc.nextInt();
        }

        System.out.println("The elements in 1D array : ");
        for(int i = 0; i < n; i++){
            System.out.println("arr[" + i + "] = " + arr1D[i]);
        }

        System.out.println("Enter rows for 2D array : ");
        int row = sc.nextInt();
        System.out.println("Enter columns for 2D array : ");
        int col = sc.nextInt();
        int[][] arr2D = new int[row][col];
        System.out.println("Enter the elements in 2D array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements in 2D array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.println("arr[" + i + "][" + j +"] = " + arr2D[i][j]);
            }
        }


        int min1D = Integer.MAX_VALUE, min2D = Integer.MAX_VALUE, max1D = Integer.MIN_VALUE, max2D = Integer.MIN_VALUE;

        for(int x : arr1D){
            if(min1D > x){
                min1D = x;
            }
            if(max1D < x){
                max1D = x;
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int x = arr2D[i][j];
                if(min2D > x){
                    min2D = x;
                }
                if(max2D < x){
                    max2D = x;
                }
            }
        }

        System.out.println("Max in 1D = " + max1D);
        System.out.println("Min in 1D = " + min1D);
        System.out.println("Max in 2D = " + max2D);
        System.out.println("Min in 2D = " + min2D);
    }
}
