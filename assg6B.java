public class assg6B {
    public static void main(String[] args) {
        int P[] = {1, 2, 5, 6, 7, 10};
        int n1 = P.length;
        int Q[] = {3, 4, 8, 9};
        int n2 = Q.length;

        System.out.println("P array : ");
        for(int x = 0; x < n1; x++){
            System.out.print(P[x] + " ");
        }
        System.out.println();

        System.out.println("Q array : ");
        for(int x = 0; x < n2; x++){
            System.out.print(Q[x] + " ");
        }
        System.out.println();
        int R[] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(P[i] < Q[j]){
                R[k++] = P[i++];
            }else{
                R[k++] = Q[j++];
            }
        }
        while(i < n1){
            R[k++] = P[i++];
        }
        while(j < n2){
            R[k++] = Q[j++];
        }

        System.out.println("R array : ");
        for(int x = 0; x < R.length; x++){
            System.out.print(R[x] + " ");
        }
        System.out.println();
    }
}
