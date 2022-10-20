package Stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    Stack02 stack02 = new Stack02();
    @BeforeEach
    void setUp(){
        // ex) db에서 데이터 지우는 코드
        // ex) db에서 데이터를 넣는 코드
        System.out.println("befor each");
    }

    @Test
    void pushTest() {

        stack02.push(10);
        stack02.push(20);

        Integer[] arr = stack02.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    @DisplayName("push, pop이 잘 되었는지 확인")
    void pushAndPop(){
        stack02.push(10);
        stack02.push(20);

        assertEquals(20,stack02.pop());
        assertEquals(10,stack02.pop());
        assertThrows(RuntimeException.class, () ->{
            stack02.pop();
        });

    }

    @Test
    @DisplayName("isEmpty")
    void isEmpty(){
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    void isFull(){
        Stack02 stack02 = new Stack02(2);
        stack02.push(10);
        assertFalse(stack02.isFull());
        stack02.push(10);
        assertTrue(stack02.isFull());
        assertThrows(RuntimeException.class, () ->{
            stack02.push(20);
        });
    }

}