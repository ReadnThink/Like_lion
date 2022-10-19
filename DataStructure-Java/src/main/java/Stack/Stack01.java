package Stack;

public class Stack01 {
    private int[] arr = new int[10000];
    //arrlist로 하면 push할때마다 배열을 계속 만들어서 시간차이가 난다.
    private int top = -1; // index를 0으로 시작하기 위해서

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value){

        arr[++top] = value;
    }

    public int pop(){
        int value = this.arr[this.top--];
        System.out.println(value + "을 pop합니다");
        return value;
    }
    public int[] getArr(){
        return arr;
    }

}
