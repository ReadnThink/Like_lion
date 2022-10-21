package Stack;

import java.util.Arrays;

public class SolveBracket {

    // 시간복잡도 O(n^2)
    // boolean은 true, false 2가지 뿐이여서 메모리를 가장 적게 잡는다.

    public boolean solution(String s){
        //indexof문자열이 처음 등장하는 index를 리턴
        while(s.indexOf("()") >= 0){
            System.out.println(s);
            s = s.replace("()", "");
        }
        //while을 돌고나서 s의 길이가 0이면 짝이 맞는것.
        return s.length()==0;
    }

    public boolean solution1(String s){
        while(s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");

            s = String.join("", splitted);
//            System.out.println(Arrays.toString(splitted));
        }
        return s.length()==0;
    }
}
