package Thu221006.File;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        FileReader reader = new FileReader("a_file.txt");

        //char c = (char) reader.read();

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println((char)reader.read());
        }

    }
}
