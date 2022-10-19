package Mon221017;

import java.util.Scanner;

public class SelectionSort {
    //배열을 전부 탐색며 가장 작을것을 선택해서 제일 앞으로 보내기
    public static void selectionSort(int[] arr){
        int index = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int min = arr[i];
            for(int j = i+1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }
            }
            if(arr[i] > min){
                swapArr(arr, i, index);
            }
        }


    }
    private static void swapArr(int[] arr,  int i, int index) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
