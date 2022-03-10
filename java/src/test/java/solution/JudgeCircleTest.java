package solution;

import junit.framework.TestCase;

public class JudgeCircleTest extends TestCase {

    public void testJudgeCircle() {
        JudgeCircle jc = new JudgeCircle();
        assertTrue(jc.judgeCircle("UD"));
        assertFalse(jc.judgeCircle("LL"));
    }
}