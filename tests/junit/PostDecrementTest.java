import junit.framework.TestCase;
import pass.PostDecrementOperator;

public class PostDecrementTest extends TestCase {
    public void test() {
        assertEquals(0, PostDecrementOperator.op(0));
    }
}
