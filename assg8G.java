interface MeanInterface {
    double mean(int arr[]);
}

interface DeviationInterface extends MeanInterface {
    void deviation(int arr[]);
}

class MeanDeviation implements DeviationInterface {

    public double mean(int arr[]) {
        double sum = 0;
        for(int x : arr)
            sum += x;

        return sum / arr.length;
    }

    public void deviation(int arr[]) {
        double m = mean(arr);

        System.out.println("Mean = " + m);
        System.out.println("Deviation of each element:");

        for(int x : arr) {
            System.out.println(x + " -> " + (x - m));
        }
    }
}

public class assg8G {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};

        MeanDeviation obj = new MeanDeviation();

        // Call the method
        obj.deviation(arr);
    }
}
