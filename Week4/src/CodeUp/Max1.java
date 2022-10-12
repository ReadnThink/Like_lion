package CodeUp;

import java.util.Scanner;

public class Max1 {

    public void FindMax(int[] arr){
        Scanner sc = new Scanner(System.in);
        int max = arr[0]; //max값은 배열안만 에서 정하는 것이 좋다.
        int index = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }


    public static void main(String[] args) {

        Max1 max1 = new Max1();

        int[] arr = new int[9];
        max1.FindMax(arr);
    }
}
