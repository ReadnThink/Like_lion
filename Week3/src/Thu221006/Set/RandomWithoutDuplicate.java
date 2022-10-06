package Thu221006.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RandomWithoutDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomNbGenerator randomNbGenerator = new RandomNbGenerator();
        RandomApGenerator randomApGenerator = new RandomApGenerator();
        //Set< >을 숫자면 Integer 알파벳이면 Charter로 해줘야 한다...
        // 한번에 받을 수 는 없을까??
        // Object로 받아봤지만 객체안의 함수에서 넘어오는값을 처리하기가 힘들다..
        Set<Character>setInteger = new HashSet<>();

        for (int i = 0; i < 50; i++){
                setInteger.add((char)(randomNbGenerator.generater(26) + 65));
        }
        System.out.println(setInteger);
        System.out.println(setInteger.size());
    }
}
