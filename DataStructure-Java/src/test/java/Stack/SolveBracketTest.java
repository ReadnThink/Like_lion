package Stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket solveBracket = new SolveBracket();
        assertTrue(solveBracket.solution("()()"));
//        assertTrue(solveBracket.solution("(())()"));
//        assertTrue(solveBracket.solution(")()("));
//        assertTrue(solveBracket.solution("(()("));
//        assertTrue(solveBracket.solution(""));

        //(O(n^)이면 시간이 엄청 오래걸리지만 O(n)으로 하게되면 빨리된다.
//        assertTrue(solveBracket.solution("(".repeat(5_000_000)+")".repeat(5_000_000)));;

    }
}