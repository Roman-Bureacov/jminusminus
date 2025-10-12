package junit;

import junit.framework.TestCase;
import pass.LessThanOperator;

public class LessThanTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGreaterEqual() {
        assertEquals(true, LessThanOperator.op(1, 2));
        assertEquals(false, LessThanOperator.op(1, 1));
        assertEquals(false, LessThanOperator.op(2, 1));
    }
}
