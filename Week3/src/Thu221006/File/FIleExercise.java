package Thu221006.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FIleExercise {

    //파일 목록을 확인하는 메소드
    public  void printFiles(){
        File dir = new File("./"); // pathname위치의 파일들을 전부 불러온다.
        File files[] = dir.listFiles();
        //System.out.println(files[0]);
        for (File file : files) {
            System.out.println(file);
        }
    }

    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

      //  System.out.println((char) fileReader.read());
        return (char) fileReader.read();
    }

    public static void main(String[] args) throws IOException {
        FIleExercise fIleExercise = new FIleExercise();
        char c = fIleExercise.readAChar("aa_file.txt");
        System.out.println(c);
    }
}

