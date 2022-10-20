package Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Stack02Test {

    @BeforeEach
    void setUp(){
        // ex) db에서 데이터 지우는 코드
        // ex) db에서 데이터를 넣는 코드
        System.out.println("befor each");
    }

    @Test
    void pushTest() {
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        Integer[] arr = stack02.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    @DisplayName("push, pop이 잘 되었는지 확인")
    void pushAndPop(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        assertEquals(20,stack02.pop());
        assertEquals(10,stack02.pop());


    }
}