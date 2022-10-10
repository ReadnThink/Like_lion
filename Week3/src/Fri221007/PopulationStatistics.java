package Fri221007;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    public List<PopulationMove> readLine(String filename) throws IOException {
        List<PopulationMove> pm = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str = "";
        while( (str = br.readLine()) != null){
            PopulationMove tmp = parse(str);
            pm.add(tmp);
        }
        return pm;
    }

    public PopulationMove parse(String str){
        String[] splits = str.split(",");

        return new PopulationMove(splits[0], splits[6]); //전출, 전입
    }

    public void FileCreate(String filename) throws IOException {
        File file = new File(filename);

        file.createNewFile();
        if(file.exists()){
            System.out.println("파일을 만들었습니다.");
        }else{
            System.out.println("파일 만들기를 실패하였습니다.");
        }
    }

    public void WriteFile(List<String> strs, String newfile){
        File file = new File(newfile);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }




    public static void main(String[] args) throws IOException {
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pm = new ArrayList<>();
        String filename = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\2021_인구관련연간자료_20220927_66125.csv";
        String newfile = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\From_to.txt";

        //구조체 배열(pm) 에 split된 전출, 전입 정보 담기
        pm = ps.readLine(filename);

        //strs에 (String배열) pm정보 옮기기
        // (writer를 통해 새 파일에 전출, 전입 정보 옮기기 위해)
        List<String> strs = new ArrayList<>();
        for (PopulationMove populationMove : pm) {
            strs.add(ps.fromToString(populationMove));
        }

        //split된  str배열을 통해 전입 전출 정보가 있는 새 파일 생성
        ps.FileCreate(newfile);
        ps.WriteFile(strs,newfile);

        //map을 통해 중복된 전입, 전출정보를 카운트.
        MoveCount moveCount = new MoveCount();

        moveCount.setMoveCntMap(pm);
        Map<String, Integer> moveCntMap = moveCount.getMoveCntMap();


        //heatmap에 반영할 정보로 변경
        HeatMap heatMap = new HeatMap();
        Map<String, Integer> heatMapIdx = heatMap.setheatMapIdx();

//        System.out.println(heatMapIdx);

        //heatmap 파일 만들기
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String[] fromto = key.split(",");
            String s = String.format("[%s, %s, %d],\n", heatMapIdx.get(fromto[0]),heatMapIdx.get(fromto[1]), moveCntMap.get(key));
            cntResult.add(s); //hashmap으로 카운트 한 것을 반영
        }
        Collections.sort(cntResult);

        System.out.println(cntResult);

        String FinalHeatMap = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\for_heatmap.txt";
        ps.WriteFile(cntResult,FinalHeatMap);
//        CreateFile createFile = new CreateFile();
////        createFile.createAFile(FinalHeatMap);
//        createFile.write(cntResult, FinalHeatMap);
////        createFile.write(cntResult, "for_heatmap.txt");

    }
}
