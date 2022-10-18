import java.util.Scanner;

public class RectangleStar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt() ;

        makeRectangle(x, y);
    }

    private static void makeRectangle(int x,int y) {

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
