package pass;

public class AndOperator {
    private static int a = 0;

    public static boolean op(boolean a, boolean b) {
        return a && b;
    }

    public static int opShortCircuit(boolean boolLeft, boolean boolRight) {
        a = 0;
        if (a(boolLeft) && b(boolRight));

        return a;
    }

    private static boolean a(boolean bool) {
        a++;
        return bool;
    }

    private static boolean b(boolean bool) {
        a++;
        return bool;
    }
}
