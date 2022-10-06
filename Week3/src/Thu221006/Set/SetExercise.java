package Thu221006.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); //tree set
        set1.add("나는 머리가 좋아");
        set1.add("나는 창의적이야");
        set1.add("나는 빨리 배워");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(3);
        setInteger.add(4);
        System.out.println(set1);
        System.out.println(setInteger);
    }
}
