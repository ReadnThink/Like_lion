package Fri221007;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    // constructor 추가 fromSido, toSido를 받아서 맴버변수에 넣는 기능
    PopulationMove(int fromSido, int toSido){
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    //private로 선언된 필드는 getter, setter를 통해 접근해야한다.


    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

}
