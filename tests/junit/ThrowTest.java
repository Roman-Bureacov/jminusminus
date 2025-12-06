import java.util.concurrent.TimeoutException;

import junit.framework.TestCase;
import pass.Throw;

public class ThrowTest extends TestCase {
    public void test() {
        try {
            Throw.op1();
        } catch (Exception e) {
            assertEquals(e.getClass(), RuntimeException.class);
        }

        try {
            Throw.op2();
        } catch (Exception e) {
            assertEquals(e.getClass(), TimeoutException.class);
            assertEquals(e.getMessage(), Throw.str1);
        }

        try {
            Throw.op3();
        } catch (Error e) {
            assertEquals(e.getClass(), InternalError.class);
            assertEquals(e.getMessage(), Throw.str2);
        }
    }

}
