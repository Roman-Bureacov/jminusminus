package pass;

import java.lang.RuntimeException;
import java.util.concurrent.TimeoutException;
import java.lang.InternalError;

public class Throw {
    public static String str1 = "An exception, oh no !!!";
    public static String str2 = "wait, how did you catch this?";

    public static void op1() {
        throw new RuntimeException();
    }

    public static void op2() {
        throw new TimeoutException(str1);
    }

    public static void op3() {
        throw new InternalError(str2);
    }
}