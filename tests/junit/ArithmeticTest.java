import static junit.framework.Assert.assertEquals;

import junit.framework.TestCase;
import pass.DivAssignOperator;
import pass.RemainderOperator;
import pass.StarAssignOperator;

/**
 * Tests the arithmetic operators
 * @author Roman Bureacov
 * @version 2025-10
 */
public class ArithmeticTest extends TestCase {
    public void testRemainder() {
        assertEquals(2, RemainderOperator.op(5,3));
        assertEquals(5, RemainderOperator.op(55,10));
        assertEquals(0, RemainderOperator.op(100,10));
    }

    public void testStarAssign() {
        assertEquals(99, StarAssignOperator.op(3, 33));
        assertEquals(20, StarAssignOperator.op(4, 5));
        assertEquals(0, StarAssignOperator.op(4, 0));
    }

    public void testDivAssign() {
        assertEquals(11, DivAssignOperator.op(33, 3));
        assertEquals(1, DivAssignOperator.op(5, 5));
        assertEquals(0, DivAssignOperator.op(0, 8));
    }
}
