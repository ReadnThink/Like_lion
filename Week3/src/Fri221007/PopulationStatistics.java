package Fri221007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

interface Interface1 {
    void readByLine(String filename);
}

public class PopulationStatistics {

    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);

        String fileContents = ""; //빈공간

        while(fileContents.length() < 1000000){

            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }


    public String readByLine(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String str;
        while((str = reader.readLine()) != null){
         //   System.out.println(str);
        }
        reader.close();
        return str;
    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data){

        String[] codes = data.split(",");
        int fromsido = Integer.parseInt(codes[0]);
        int tosido = Integer.parseInt(codes[6]);

        return new PopulationMove(fromsido, tosido);
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\2021_인구관련연간자료_20220927_66125.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        //populationStatistics.readByLine2(address);
        String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
        PopulationMove pm = populationStatistics.parse(data);
        System.out.println(pm.getFromSido());
        System.out.println(pm.getToSido());

    }
}
