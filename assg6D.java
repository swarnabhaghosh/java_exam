public class assg6D {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55};
        int n = arr.length;
        System.out.println("original array : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int x = 1;
        int y = 2;
        int search1 = 33, idx = -1;
        switch (x) {
            case 1:
                for(int i = 0; i < n; i++){
                    if(arr[i] == search1){
                        idx = i;
                        break;
                    }
                }
                if(idx != -1){
                    System.out.println("searching element = " + search1 + " Found in index = " + idx);
                }else{
                    System.out.println("searching element = " + search1 + " not found");
                }
                break;

            case 2:
                int low = 0;
                int high = arr.length;
                while(low <= high){
                    int mid = low + (high - low)/2;
                    if(arr[mid] == search1){
                        idx = mid;
                        break;
                    }else if(arr[mid] > search1){
                        high = mid - 1;
                    }else{
                        low = mid + 1;
                    }
                }
                if(high < low){
                    System.out.println("searching element = " + search1 + " not found");
                }else{
                    System.out.println("searching element = " + search1 + " Found in index = " + idx);
                }
            default:
                break;
        }
    }
}
