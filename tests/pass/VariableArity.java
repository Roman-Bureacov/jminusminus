package pass;

public class VariableArity {
    public int op(int i, int... a) {
        return a[i];
    }
}