package Thu.Set;

public class RandomApGenerator implements NumberGenerator {
    @Override
    public int generater(int a) {
        return (int)(Math.random() * a);
    }
}
