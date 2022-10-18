package CodeUp;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] sort(int[] arr) {
        // i = 1 arr[1] j vs arr[0]
        // i = 2 일때 arr[2] j vs arr[1]
        // i = 3 일때 arr[3] j vs arr[2]
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                //System.out.printf("i:%d j:%d j-1:%d\n", i, j, j + 1);
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Main insertionSort = new Main();

        int[] result = insertionSort.sort(arr);
        System.out.println(Arrays.toString(result));

    }
}

