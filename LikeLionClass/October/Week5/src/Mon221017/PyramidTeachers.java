package Mon221017;

import java.util.Scanner;

public class PyramidTeachers {
    private String letter = "*";

    public PyramidTeachers(){}

    public PyramidTeachers(String letter) {
        this.letter = letter;
    }

    public void printStar(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) { //홀수개 출력
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        PyramidTeachers pyramid = new PyramidTeachers();
        pyramid.printStar();
    }
}
