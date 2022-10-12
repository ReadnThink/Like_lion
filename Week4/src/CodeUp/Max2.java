package CodeUp;

import java.util.Scanner;

public class Max2 {
    public int[][] FindArr(int[][] arr){
        Scanner sc = new Scanner(System.in);

        int max = arr[0][0]; //max값은 배열안만 에서 정하는 것이 좋다.
        int index_i = 0;
        int index_j = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();

                if(arr[i][j] > max){
                    max = arr[i][j];
                    index_i = i + 1;
                    index_j = j + 1;
                }

            }
        }

        System.out.println(max);
        System.out.print(index_i + " " + index_j);



        return arr;
    }


    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        Max2 max = new Max2();
        max.FindArr(arr);
    }
}
