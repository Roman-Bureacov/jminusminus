import junit.framework.TestCase;
import pass.ForStatement;

public class ForStatementTest extends TestCase {
    public void test() {
        assertEquals(5, ForStatement.op1(5, 0));
        assertEquals(6, ForStatement.op1(5, 1));

        assertEquals(4, ForStatement.op2(6, 2, 1));

        assertEquals(3, ForStatement.op3(5, 3, 0));
        assertEquals(4, ForStatement.op3(4, 5, 0));
    }
}
