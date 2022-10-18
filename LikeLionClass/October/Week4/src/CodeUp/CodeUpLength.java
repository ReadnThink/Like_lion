package CodeUp;

import java.util.Scanner;


public class CodeUpLength {

    public int length(int n){
        int l = 0;
        while(n > 0){
            n /= 10;
            l++;
        }
        return l;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        CodeUpLength codeUpLength = new CodeUpLength();

        int result = codeUpLength.length(n);
        System.out.println(result);

    }
}
