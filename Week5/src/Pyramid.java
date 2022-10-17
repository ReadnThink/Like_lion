import java.util.Scanner;

public class Pyramid {
    private String letter = "*";

    public Pyramid(){}

    public Pyramid(String letter) {
        this.letter = letter;
    }

    public void printStar(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(this.letter);
            }

            for (int j = 0; j < i; j++){
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.printStar();
    }
}
