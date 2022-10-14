import java.util.Arrays;

public class InsertionSortTest {
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
        //5에서 출발합니다. index = 1
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSortTest insertionSort = new InsertionSortTest();

        int[] result = insertionSort.sort(arr);
        System.out.println(Arrays.toString(result));
//        result = insertionSort.sort(arr, 2);
//        System.out.println(Arrays.toString(result));
//        result = insertionSort.sort(arr, 3);
//        System.out.println(Arrays.toString(result));
//        result = insertionSort.sort(arr, 4);
//        System.out.println(Arrays.toString(result));

    }
}
