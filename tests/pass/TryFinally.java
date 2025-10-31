package pass;

public class TryFinally {
    public int op(Object o) {
        int i = 0;

        try {
            o.toString();
            i++;
        } finally {
            return i;
        }
    }
}