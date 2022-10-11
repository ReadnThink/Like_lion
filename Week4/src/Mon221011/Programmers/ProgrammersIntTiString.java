package Mon221011.Programmers;

import java.util.Scanner;

public class ProgrammersIntTiString {
    public char[] sum(int n, int length){

        char[] result = new char[length];
        length--;
        while(length >= 0){
            int k = (n % 10) + 48;
            result[length] = (char) k;
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
        ProgrammersIntTiString programmersCntN = new ProgrammersIntTiString();

        int n = sc.nextInt();
        int length = programmersCntN.length(n);
        char[] result = programmersCntN.sum(n, length);
        System.out.println(result);
    }
}
