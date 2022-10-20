package Programmers;

public class Sum {
    public long solution(int a, int b){
        //차를 구한다.
        int k = b - a;

        //작은거 기준으로 더해감
        int q = (a < b) ? a : b;
        long answer = q;

        // -예외처리
        if (k < 0)
            k *= -1;
        // 0이면 아무거나 리턴
        if (k == 0)
            return a;

        for (int i = 0; i < k; i++){
            answer += q + i + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Sum sol =  new Sum();
        System.out.println(sol.solution(a,b));
    }
}

