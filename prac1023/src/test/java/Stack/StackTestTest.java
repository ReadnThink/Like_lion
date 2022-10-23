package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTestTest {
    @Test
    void test() {
        StackTest stackTest = new StackTest();
        assertTrue(stackTest.StackPrac("((()))"));
        assertFalse(stackTest.StackPrac("(()))"));

        assertTrue(stackTest.StackSplit("((()))"));
        assertFalse(stackTest.StackSplit("(((()))"));

        assertTrue(stackTest.StackStack("((()))"));
        assertFalse(stackTest.StackStack("(((()))"));
    }
}