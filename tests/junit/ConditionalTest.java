package junit;

import junit.framework.TestCase;
import pass.AndOperator;
import pass.ConditionalCombination;
import pass.OrOperator;

public class ConditionalTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testOr() {
        assertEquals(false, OrOperator.op(false, false));
        assertEquals(true, OrOperator.op(false, true));
        assertEquals(true, OrOperator.op(true, false));
        assertEquals(true, OrOperator.op(true, true));
    }
    
    public void testAnd() {
        assertEquals(false, AndOperator.op(false, false));
        assertEquals(false, AndOperator.op(false, true));
        assertEquals(false, AndOperator.op(true, false));
        assertEquals(true, AndOperator.op(true, true));
    }

    public void testCombinations() {
        // A && B || C
        assertEquals(true, ConditionalCombination.AndOr(true, true, false));
        assertEquals(true, ConditionalCombination.AndOr(true, true, true));
        assertEquals(true, ConditionalCombination.AndOr(true, true, false));
        assertEquals(false, ConditionalCombination.AndOr(false, true, false));

        // A || B && C
        assertEquals(true, ConditionalCombination.OrAnd(true, false, false));
        assertEquals(true, ConditionalCombination.OrAnd(false, true, true));
        assertEquals(false, ConditionalCombination.OrAnd(false, true, false));
        assertEquals(false, ConditionalCombination.OrAnd(false, false, true));

    }
}
