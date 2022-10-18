package Wed221005.CalcMine;

interface Randon{

    public void plus();
    public void minus();
    public void multi();
    public void div();
    public void mod();
}

public class RandomCalc implements Randon {
    private int a;

    private int random = (int)(Math.random() * 11);

    public int getRandom() {
        return random;
    }

    RandomCalc(int a){
        this.a = a;
    }


    @Override
    public void plus() {
        System.out.println(a + random);
    }

    @Override
    public void minus() {
        System.out.println(a - random);
    }

    @Override
    public void multi() {
        System.out.println(a * random);
    }

    @Override
    public void div() {
        if(random == 0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
            return;
        }
        double result = (float)a / random;
        System.out.println(result);
    }

    @Override
    public void mod() {
        if(random == 0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다");
            return;
        }
        System.out.println(a % random);
    }
}
