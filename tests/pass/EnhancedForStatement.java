package pass;

public class EnhancedForStatement {
    public int op(int[] a, int b) {
        for (int i : a) {
            b++;
        }

        return b;
    }
}