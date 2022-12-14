package Mon221011.Programmers;

import java.util.Scanner;

public class ProgrammersCntN2 {
    public int sum(int n){
        int result = 0;
        while(n != 0){
            result +=  n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgrammersCntN2 programmersCntN = new ProgrammersCntN2();

        int n = sc.nextInt();
        int result = programmersCntN.sum(n);
        System.out.println(result);
    }
}
