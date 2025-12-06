import junit.framework.TestCase;
import pass.PostIncrementOperator;

public class PostIncrementTest extends TestCase {
    public void test() {
        assertEquals(0, PostIncrementOperator.op(0));
    }
}
