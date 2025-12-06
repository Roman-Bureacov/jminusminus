package pass;

public class TryCatch {
    public static int op(Object o) {

        try {
            o.toString();
        } catch (NullPointerException e) {
            return 1;
        }

        return 0;
    }
}