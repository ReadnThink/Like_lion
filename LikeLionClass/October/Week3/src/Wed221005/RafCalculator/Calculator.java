package Wed221005.RafCalculator;

public class Calculator {
    //NumberMaker에서 만들어준 숫자를 가지고
    // 사칙연산한 결과를 출력한다.

    //추상메서드는 객체생성이 안되지만 변수로 활용할 수 있다.
    private NumberMaker numberMaker;
    private int bassNum;


    public Calculator(NumberMaker numberMaker) {
        this.numberMaker = numberMaker;
    }
    //함수 오버로딩 (생성자를 주로 많이한다.)
    public Calculator(NumberMaker numberMaker, int bassNum) {
        this.numberMaker = numberMaker;
        this.bassNum = bassNum;
    }

    public void plus(int num){
        int result = num + this.numberMaker.make(10);
        System.out.println(result);
    }
}
