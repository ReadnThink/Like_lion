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
        //인구이동을 확인하려면 전출, 전입 정보가 필요하여 데이터 2개필요. 구조체를 ArrayList와 같이 활용하였다.
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pm = new ArrayList<>();

        // 파일위치를 저장하는 변수
        String filename = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\2021_인구관련연간자료_20220927_66125.csv";
        String newfile = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\From_to.txt";

        //구조체 배열(pm) 에 split된 전출, 전입 정보 담기
        pm = ps.readLine(filename); //readLine 메소드에 parse(전입, 전출 정보만 저장하는 역할) 메소드 연결

        //strs에 (String배열) pm정보 옮기기
        // 왜 구조체배열 pm에 있는 정보를 새파일에 옮기지 않는가? = 어렵다... /방법이 있는지 계속 공부해야함.
        //writer를 통해 새 파일에 전출, 전입 정보 옮기기 위해
        List<String> strs = new ArrayList<>();
        for (PopulationMove populationMove : pm) {
            strs.add(ps.fromToString(populationMove)); //fromToString = pm에 있는 정보를 strs에 저장
        }

        //split된  str배열을 통해 전입 전출 정보가 있는 새 파일 생성
        ps.FileCreate(newfile); //파일생성
        ps.WriteFile(strs,newfile); //생성파일에 Strs(전출, 전입) 저장.

        //map을 통해 중복된 전입, 전출정보를 카운트.
        MoveCount moveCount = new MoveCount();

        moveCount.setMoveCntMap(pm);
        Map<String, Integer> moveCntMap = moveCount.getMoveCntMap();


        //heatmap에 반영할 정보로 변경
        HeatMap heatMap = new HeatMap();
        Map<String, Integer> heatMapIdx = heatMap.setheatMapIdx();

//        System.out.println(heatMapIdx);

        //최종 heatmap 파일 만들기 위해 구조체에 있는것을 String으로 전달.
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) { // moveCnt의 한줄씩 뽑아낸다.
            String[] fromto = key.split(",");
            String s = String.format("[%s, %s, %d],\n", heatMapIdx.get(fromto[0]),heatMapIdx.get(fromto[1]), moveCntMap.get(key));
            cntResult.add(s); //hashmap을 사용하기위해 중복 카운트 한 것을 반영
        }

        Collections.sort(cntResult); // 보기좋게 정렬

        System.out.println(cntResult); // 잘되었는지 확인

        // 새로운 파일 생성
        String FinalHeatMap = "C:\\Users\\iser\\Desktop\\멋사 교육자료\\자료\\for_heatmap.txt";
        ps.WriteFile(cntResult,FinalHeatMap);
//        CreateFile createFile = new CreateFile();
////        createFile.createAFile(FinalHeatMap);
//        createFile.write(cntResult, FinalHeatMap);
////        createFile.write(cntResult, "for_heatmap.txt");

    }
}
