package Wed221005.CalcMine;

public class RandomCalcMain {
    public static void main(String[] args) {
        RandomCalc calc = new RandomCalc(10);
        calc.plus();
        calc.minus();
        calc.mod();
        calc.div();
        System.out.println("random : " + calc.getRandom());
    }
}
