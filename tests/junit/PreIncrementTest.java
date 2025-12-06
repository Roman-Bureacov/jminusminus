import junit.framework.TestCase;
import pass.PreIncrementOperator;

public class PreIncrementTest extends TestCase {
    public void test() {
        assertEquals(1, PreIncrementOperator.op(0));
    }
}
