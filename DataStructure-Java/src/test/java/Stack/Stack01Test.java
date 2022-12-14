package Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @BeforeEach
    void setUp(){
        // ex) db에서 데이터 지우는 코드
        // ex) db에서 데이터를 넣는 코드
        System.out.println("befor each");
    }
    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        int[] arr = stack01.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    @DisplayName("push, pop이 잘 되었는지 확인")
    void pushAndPop(){
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        Assertions.assertEquals(20, stack01.pop());
        Assertions.assertEquals(10, stack01.pop());

    }
}