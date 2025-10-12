package junit;

import junit.framework.TestCase;
import pass.LessThanOperator;
import pass.MinusAssign;

public class MinusAssignTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGreaterEqual() {
        assertEquals(-1, MinusAssign.op(1, 2));
        assertEquals(0, MinusAssign.op(1, 1));
        assertEquals(1, MinusAssign.op(2, 1));
    }
}
