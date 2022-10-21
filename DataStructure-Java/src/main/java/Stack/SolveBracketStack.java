package Stack;

import java.util.Stack;

public class SolveBracketStack {

    // 시간복잡도 O(n)
    // boolean은 true, false 2가지 뿐이여서 메모리를 가장 적게 잡는다.

    public boolean solution(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if('(' == s.charAt(i)){
                st.push(s.charAt(i));
                System.out.println("stack's size :" + st.size());
            } else if (')' == s.charAt(i)) {
                //처음부터 닫는 괄호가 들어오면 pop할때 오류가 난다.
                if (st.empty()) return false;

                st.pop();
                System.out.println("stack's size :" + st.size());
            }
        }

        return st.empty();
    }


}
