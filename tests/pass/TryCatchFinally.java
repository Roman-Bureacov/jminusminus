package pass;

public class TryCatchFinally {
    public static int op(Object o) {
        int i = 0;

        try {
            o.toString();
        } catch (NullPointerException e) {
            i = 1;
        } finally {
            return i;
        }
    }
}