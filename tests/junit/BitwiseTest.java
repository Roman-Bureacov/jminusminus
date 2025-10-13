import junit.framework.TestCase;
import pass.BitwiseAndOperator;
import pass.BitwiseCombination;
import pass.BitwiseOrOperator;
import pass.BitwiseXorOperator;

public class BitwiseTest extends TestCase {
    public void testIntAnd() {
        assertEquals(25 & 3, BitwiseAndOperator.op(25, 3));
        assertEquals(555 & 0, BitwiseAndOperator.op(555, 0));
        assertEquals(333 & 666, BitwiseAndOperator.op(333, 666));
    }
    
    public void testIntOr() {
        assertEquals(25 | 3, BitwiseOrOperator.op(25, 3));
        assertEquals(555 | 0, BitwiseOrOperator.op(555, 0));
        assertEquals(333 | 666, BitwiseOrOperator.op(333, 666));
    }

    public void testIntXor() {
        assertEquals(25 ^ 3, BitwiseXorOperator.op(25, 3));
        assertEquals(555 ^ 0, BitwiseXorOperator.op(555, 0));
        assertEquals(333 ^ 666, BitwiseXorOperator.op(333, 666));
    }

    public void testCombinations() {
        int a = 721228;
        int b = 102976;
        int c = 291925;
        int d = 122452;

        assertEquals(a & b | c, BitwiseCombination.AndOr(a, b, c));
        assertEquals(a | b & c, BitwiseCombination.OrAnd(a, b, c));
        assertEquals(a & b | c ^ d, BitwiseCombination.AndOrXor(a, b, c, d));
        assertEquals(a ^ b & c | d, BitwiseCombination.XorAndOr(a, b, c, d));
        assertEquals(a | b ^ c & d, BitwiseCombination.OrXorAnd(a, b, c, d));
        assertEquals(a & b & c, BitwiseCombination.AndAnd(a, b, c));
        assertEquals(a | b | c, BitwiseCombination.OrOr(a, b, c));
        assertEquals(a ^ b ^ c, BitwiseCombination.XorXor(a, b, c));
    }

    /* // bitwise long tests
    public void testLongAnd() {
        assertEquals(25L & 3L, BitwiseAndOperator.op(25L, 3L));
        assertEquals(555L & 0L, BitwiseAndOperator.op(555L, 0L));
        assertEquals(333L & 666L, BitwiseAndOperator.op(333L, 666L));
    }

    public void testLongOr() {
        assertEquals(25L | 3L, BitwiseOrOperator.op(25L, 3L));
        assertEquals(555L | 0L, BitwiseOrOperator.op(555L, 0L));
        assertEquals(333L | 666L, BitwiseOrOperator.op(333L, 666L));
    }

    public void testLongXor() {
        assertEquals(25L ^ 3L, BitwiseXorOperator.op(25L, 3L));
        assertEquals(555L ^ 0L, BitwiseXorOperator.op(555L, 0L));
        assertEquals(333L ^ 666L, BitwiseXorOperator.op(333L, 666L));
    }
     */
}
