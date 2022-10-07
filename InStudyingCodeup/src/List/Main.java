package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> Entry = new ArrayList<>();
        String[] All = new String[n];
        for (int i = 0; i < n; i++) {
            All[i] = sc.next();
        }
        String[] check = new String[n];
        for(int i = 0; i < n; i++){
            check[i] = All[i].split("")
        }


    }
}
