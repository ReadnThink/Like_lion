package Thu221006.Map;

import java.util.HashMap;

public class AlphabetCnt {
    public boolean isAlphabet(char a){
        if((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c = 'A'; c <= 'Z'; c++ ){
            alphabetMap.put(c,0);
        }

        AlphabetCnt alphabetCnt = new AlphabetCnt();
        String s1 = "I'm genius".toUpperCase();


        for (int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if(isAlphabet){
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}
