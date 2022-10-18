package Thu221006.File;

import java.io.File;
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

    //1개 읽기
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

      //  System.out.println((char) fileReader.read());
        return (char) fileReader.read();
    }

    //2개만 읽기

    public String read2Chars(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();

        return str;
    }

    //n개만큼 읽기

    public String readNChars(String filename, int num) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        if(num > filename.length()){
            System.out.println("출력 할 수 있는 글자수를 초과하였습니다.");
        }
        else{
            for(int i = 0; i < num; i ++){
                str += (char)fileReader.read();
            }
        }
        return str;
    }

    public String readline(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";

       // str += (char)fileReader.;

        return str;
    }

    public static void main(String[] args) throws IOException {
        FIleExercise fIleExercise = new FIleExercise();
//        String str = fIleExercise.read2Chars("aa_file.txt");
//        char c = fIleExercise.readAChar("aa_file.txt");
        String str = fIleExercise.readNChars("aa_file.txt", 4);


        System.out.println(str);
    }
}

