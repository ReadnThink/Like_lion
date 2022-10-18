package CodeUp;

import java.util.Scanner;

public class CodeUpLengthSum {
    public int sum(int n){
        int result = 0;
        while(n != 0){
            result +=  n % 10;
            n /= 10;
        }
        return result;
    }

    public int length(int result){
        int l = 0;
        while(result > 0){
            result /= 10;
            l++;
        }
        return l;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CodeUpLengthSum codeUpLengthSum = new CodeUpLengthSum();

        int n = sc.nextInt();
        int result = codeUpLengthSum.sum(n);
        int resultLength = codeUpLengthSum.length(result);
        while(resultLength != 1){
            result = codeUpLengthSum.sum(result);
            resultLength = codeUpLengthSum.length(result);
        }
        System.out.println(result);
    }
}
