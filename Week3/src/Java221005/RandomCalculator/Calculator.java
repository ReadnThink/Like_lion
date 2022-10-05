package Java221005.RandomCalculator;

public class Calculator {

    private NumberCreator numberCreator;
    private  int bassNum;

    public Calculator(NumberCreator numberCreator){
        this.numberCreator = numberCreator;
    }

    public Calculator(NumberCreator numberCreator, int bassNum){
        this.numberCreator = numberCreator;
        this.bassNum = bassNum;
    }
    public void plus(int num){
        System.out.println(num + this.numberCreator.create(10));
    }
}
