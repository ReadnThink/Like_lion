package Thu221006.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FIleExercise {
    public static void main(String[] args) throws FileNotFoundException {
        //FileReader fileReader = new FileReader("./aa_file.txt");

        File dir = new File("./");
        File files[] = dir.listFiles();
        //System.out.println(files[0]);
        for (File file : files){
            System.out.println(file);
        }
    }
}
