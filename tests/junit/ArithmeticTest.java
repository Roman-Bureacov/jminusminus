import static junit.framework.Assert.assertEquals;

import junit.framework.TestCase;
import pass.RemainderOperator;

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
}
