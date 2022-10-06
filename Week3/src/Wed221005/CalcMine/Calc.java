package Wed221005.CalcMine;

public class Calc {

    private int a;
    private int b;

    Calc(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void plus(){
        System.out.println(a + b);
    }

    public void minus(){
        System.out.println(a - b);
    }

    public void multi(){
        System.out.println(a * b);
    }

    public void div(){
        double result = (float)a / b;
        System.out.println(result);
    }

    public void mod(){
        System.out.println(a % b);
    }

}
