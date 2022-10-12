package CodeUp;

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0;
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

    }
}
