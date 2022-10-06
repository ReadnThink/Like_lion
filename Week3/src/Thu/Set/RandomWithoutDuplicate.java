package Thu.Set;

import Thu.List.RandomNbGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandomWithoutDuplicate {
    public static void main(String[] args) {
        RandomNbGenerator randomNbGenerator = new RandomNbGenerator();
        Set<Integer> setInteger = new HashSet<>();


        for (int i = 0; i < 50; i++){
            setInteger.add(randomNbGenerator.generater(10));
        }
        System.out.println(setInteger);
    }
}
