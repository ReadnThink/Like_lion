package Stack;

import java.util.Stack;

public class StackTest {
    public boolean StackSplit(String s){
        //Splited = 구분자 기준으로 문자열을 배열로 생성한다.
        //join = 구분자 기준으로 여러개의 배열을 문자열로 반환한다.

        while(s.indexOf("()") >= 0){
            String[] splited = s.split("\\(\\)");
            System.out.println("s="+s);
            for (String s1 : splited) {
                System.out.println("sp"+s1);
            }
            s = String.join("", splited);
        }
        return s.length() == 0;
    }
    public boolean StackPrac(String s){
        //indexof = 해당 문자의 인덱스위치를 반환한다. 그래서 0번째 인덱스까지 검사해야한다.

        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean StackStack(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            } else if(s.charAt(i) == ')'){
                st.pop();
            }
        }
        return st.empty();
    }
}
