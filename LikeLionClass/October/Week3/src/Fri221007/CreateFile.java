package Fri221007;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CreateFile {
    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    //List<String>을 지정한 파일(filename)에 write
    public void write(List<String> strs, String filename){
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }
}
