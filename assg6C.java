public class assg6C {
    public static void main(String[] args) {
        int arr[] = {6,5,8,7,3};
        int n = arr.length;
        System.out.println("original array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        int x = 1;
        int y = 2;
        int z = 3;
        switch (z) {
            case 1:
                for(int i = 0; i < n - 1; i++){
                    for(int j = 0; j < n - i - 1; j++){
                        if(arr[j] > arr[j + 1]){
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("array after applying Bubble sort : ");
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            case 2:
                for(int i = 0; i < n - 1; i++){
                    int min_idx = i;
                    for(int j = i + 1; j < n; j++){
                        if(arr[j] < arr[min_idx]) min_idx = j;
                    }
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
                System.out.println("array after applying Selection sort : ");
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            case 3:
                for(int i = 1; i < n; i++){
                    int j = i - 1;
                    int temp = arr[i];
                    while(j >= 0 && arr[j] > temp){
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = temp;
                }
                System.out.println("array after applying Insertion sort : ");
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
