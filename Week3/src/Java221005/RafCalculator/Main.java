package Java221005.RafCalculator;

public class Main {
    public static void main(String[] args) {
        NumberMaker numberMaker = new RandomNumberCreator();
        Calculator randomNumberCalculator = new Calculator(numberMaker);
        randomNumberCalculator.plus(20);

        Calculator byPassNumberCalculator = new Calculator(new ByPassNumberMaker(), 20000);
        byPassNumberCalculator.plus(50);
    }
}
