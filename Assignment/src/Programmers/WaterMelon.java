package Programmers;

import java.util.Scanner;

public class WaterMelon {
    public String solution(int n){

        String answer = "";

        for(int i = 1; i <= n; i++){
            if(i % 2 == 0)
                answer += "박";
            else if(i % 2 == 1)
                answer+="수";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WaterMelon sol =  new WaterMelon();
        int n = sc.nextInt();
        String result = sol.solution(n);
        System.out.println(result);
    }
}

