import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3,1,2};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] Bubble(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j + 1]){
                    arr = swapIndex(arr, j, j + 1);

                }
            }
        }
        return arr;
    }

    private static int[] swapIndex(int[] arr, int j, int i) {
        int temp;

        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j+1] = temp;

        return arr;
    }
}
