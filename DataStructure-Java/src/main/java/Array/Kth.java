package Array;

import java.util.Arrays;

public class Kth {
    public int[] solution(int[] array, int[][] commands) throws ArrayIndexOutOfBoundsException{
        /*
        * 1. 빈 배열 tmp에 2차월 배열 commands의 0, 1,번째 요소만큼의 데이터를 넣는다.
        * 2. answer배열에 commands의 2번째 인덱스의 요소를 넣는다
        * 3. commands의 길이만큼 반복.
        * 4. 배열 반환
        * */
        int[] answer = new int[commands.length];

//        int[] tmp;
        for (int i = 0; i < commands.length; i++) {
                int[] tmp = Arrays.copyOfRange(array,(commands[i][0]-1),(commands[i][1]));
                Arrays.sort(tmp);
                answer[i] = tmp[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        Kth k = new Kth();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2, 5, 3}, {4, 4 ,1}, {1, 7, 3}};
        int[] answer = k.solution(arr, commands);
        System.out.println(Arrays.toString(answer));
    }
}
