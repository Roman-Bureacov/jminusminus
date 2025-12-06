import junit.framework.TestCase;
import pass.PreDecrementOperator;

public class PreDecrementTest extends TestCase {
    public void test() {
        assertEquals(-1, PreDecrementOperator.op(0));
    }
}
