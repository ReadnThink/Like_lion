package Fri221007;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveCount {
    Map<String, Integer> moveCntMap = new HashMap<>();

    public void setMoveCntMap(List<PopulationMove> populationMoves){
        for (PopulationMove populationMove : populationMoves) {
            String key = populationMove.getFromSido() + "," + populationMove.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key,1);
            }else{
                moveCntMap.put(key,moveCntMap.get(key) + 1);
            }
        }
    }

    public Map<String,Integer> getMoveCntMap(){
        return moveCntMap;
    }
}
