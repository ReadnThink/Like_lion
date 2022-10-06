package Thu.Set;

import java.util.HashSet;
import java.util.Set;

public class RandomWithoutDuplicate {
    public static void main(String[] args) {
        RandomNbGenerator randomNbGenerator = new RandomNbGenerator();
        Set<Character>setInteger = new HashSet<>();


        for (int i = 0; i < 50; i++){
            setInteger.add((char) (randomNbGenerator.generater(26) + 65));
        }
        System.out.println(setInteger);
        System.out.println(setInteger.size());
    }
}
