import junit.framework.TestCase;
import pass.GreaterThanEqualOperator;

public class GreaterEqualTest extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGreaterEqual() {
        assertEquals(false, GreaterThanEqualOperator.op(1, 2));
        assertEquals(true, GreaterThanEqualOperator.op(1, 1));
        assertEquals(true, GreaterThanEqualOperator.op(2, 1));
    }
}
