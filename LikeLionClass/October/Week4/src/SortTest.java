import java.util.Arrays;

public class SortTest {

    // 강사님이 알려주신 Sort
    // Selection과 Bubble 중간
    // i를 받아온다.
    // 2중 for 문이 필요한 이유.
    private int[] Sort(int[] arr, int i) {
        //int i = 0;
        for(int j = i + 1; j < arr.length; j++) {
            if(arr[i] > arr[j]) {
                swapIndex(arr, i, j);
            }
        }

        return arr;
    }

    private int[] swapIndex(int[] arr, int j, int i) {
        int temp;

        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j+1] = temp;

        return arr;
    }

    public static void main(String[] args) {
        SortTest st = new SortTest();
        int[] arr = new int[] {8,7,6,5,4,6,1,2};

        int[] result = st.Sort(arr, 0);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 1);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 2);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 3);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 4);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 5);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 6);
        System.out.println(Arrays.toString(result));

        result = st.Sort(new int[] {8,7,6,5,4,6,1,2}, 7);
        System.out.println(result);

    }


}
