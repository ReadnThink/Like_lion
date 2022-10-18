import java.util.Scanner;

public class ReculsiveStar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        f(1, n);
    }

    private static void f(int current, int n) {
        if(current > n){
            return;
        }

        makeReculsiveStar(current);
        System.out.println();

        f(current+1, n);
    }

    private static void makeReculsiveStar(int n) {

        if(n == 0){
            return ;
        }
        System.out.print("*");
        makeReculsiveStar(n - 1);

    }
}
