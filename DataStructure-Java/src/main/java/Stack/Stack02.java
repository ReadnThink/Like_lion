package Stack;

import java.util.EmptyStackException;

public class Stack02 {

    private Integer[] arr;
    private int top = -1;



    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value){
        if(isFull()){
            throw new RuntimeException("스택이 꽉차있습니다");
        }
        this.arr[++top] = value;
    }


    public int pop() {
        if(isEmpty()){
            throw new RuntimeException("스택이 비어있습니다.");
        }
        return this.arr[top--];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }


    public boolean isFull() {
        return this.top == this.arr.length -1;
    }
}
