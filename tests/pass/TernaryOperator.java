package pass;

public class TernaryOperator {
    public int op(boolean b) {
        b = (b ? 1 : 0);
        return b == 1 ? 1 : 0;
    }
}