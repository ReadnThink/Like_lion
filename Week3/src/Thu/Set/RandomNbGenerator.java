package Thu.Set;

public class RandomNbGenerator implements NumberGenerator {
    @Override
    public int generater(int a) {
        return (int)(Math.random() * a);
    }
}
