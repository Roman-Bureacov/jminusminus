package pass;

public class EnhancedForStatement {
    public static int op(int[] a, int b) {
        for (int i : a) {
            b++;
        }

        return b;
    }
}