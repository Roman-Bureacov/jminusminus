import junit.framework.TestCase;
import pass.ConditionalExpression;

public class ConditionalExpressionTest extends TestCase {
    public void test() {
        assertEquals(1, ConditionalExpression.op(true, 1, 0));
        assertEquals(0, ConditionalExpression.op(false, 1, 0));
    }
}
