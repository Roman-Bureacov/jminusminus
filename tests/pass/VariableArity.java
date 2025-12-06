package pass;

public class VariableArity {
    public static int op(int i, int... a) {
        return a[i];
    }
}