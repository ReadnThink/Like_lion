package Mon221011;

import java.util.Scanner;

public class ProgrammersCntN {
    public char[] sum(int n, int length){

        char[] result = new char[length];
        length--;
        while(length != 0){
            result[length] = (char) ((char) n % 10);
            System.out.println(result[length]);
            n /= 10;
            length--;
        }
        return result;
    }

    public int length(int n){
        int length = 0;

        while(n != 0){
            n /= 10;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgrammersCntN programmersCntN = new ProgrammersCntN();

        int n = sc.nextInt();
        int length = programmersCntN.length(n);
        char[] result = programmersCntN.sum(n, length);
        System.out.println(result);
    }
}
