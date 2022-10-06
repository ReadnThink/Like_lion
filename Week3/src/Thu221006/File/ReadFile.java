package Thu221006.File;

import java.io.*;
import java.nio.file.Files;

public class ReadFile {
    public static void main(String[] args) throws IOException {


        FileReader reader = new FileReader("./a_file.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
}
