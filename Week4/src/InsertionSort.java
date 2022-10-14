import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int j = i;
            while(arr[j] > arr[j + 1]){
              //  swapIndex(arr, j, j+1);
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }

        return arr;
    }

    private int[] swapIndex(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);
        System.out.println(Arrays.toString(result));

    }
}
