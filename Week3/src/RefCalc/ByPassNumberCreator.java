package RefCalc;

public class ByPassNumberCreator implements NumberCreator{

    @Override
    public int create(int num) {
        return num;
    }
}
