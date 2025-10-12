import junit.framework.TestCase;
import pass.AndOperator;
import pass.ConditionalCombination;
import pass.NotOperator;
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

    public void testNot() {
        assertEquals(false, NotOperator.op(true));
        assertEquals(true, NotOperator.op(false));
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

        // !a && b
        assertEquals(false, ConditionalCombination.NotAnd(false, false));
        assertEquals(true, ConditionalCombination.NotAnd(false, true));
        assertEquals(false, ConditionalCombination.NotAnd(true, false));
        assertEquals(false, ConditionalCombination.NotAnd(true, true));
        
        // a && !b
        assertEquals(false, ConditionalCombination.AndNot(false, false));
        assertEquals(false, ConditionalCombination.AndNot(false, true));
        assertEquals(true, ConditionalCombination.AndNot(true, false));
        assertEquals(false, ConditionalCombination.AndNot(true, true));
        
        // !a || b
        assertEquals(true, ConditionalCombination.NotOr(false, false));
        assertEquals(true, ConditionalCombination.NotOr(false, true));
        assertEquals(false, ConditionalCombination.NotOr(true, false));
        assertEquals(true, ConditionalCombination.NotOr(true, true));
        
        // a || !b
        assertEquals(true, ConditionalCombination.OrNot(false, false));
        assertEquals(false, ConditionalCombination.OrNot(false, true));
        assertEquals(true, ConditionalCombination.OrNot(true, false));
        assertEquals(true, ConditionalCombination.OrNot(true, true));
        
    }
}
