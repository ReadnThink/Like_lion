package Wed221005.RafCalculator;

public class RandomNumberCreator implements NumberMaker{
    @Override
    public int make(int num) {
        return (int)(Math.random() * num);
    }
}
