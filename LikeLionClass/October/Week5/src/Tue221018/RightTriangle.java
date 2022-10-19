package Tue221018;

import java.util.Scanner;

public class RightTriangle {
    private String letter = "*";

    public RightTriangle(){}

    public RightTriangle(String letter) {
        this.letter = letter;
    }

    public void printStar(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle("@");
        rt.printStar();
    }
}
