package Thu.Map;

public class AlphabetCnt {
    public static boolean isAlphabet(char a){
        if((a >= 65 && a <= 90) || (a >= 97 && a <= 122)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "I'm genius";
        int cnt = 0;

        for (int i = 0; i < str.length(); i++){
            if(isAlphabet(str.charAt(i))){
                cnt++;
            }
        }
        System.out.println("알파벳 갯수는 :"+cnt);
    }
}
