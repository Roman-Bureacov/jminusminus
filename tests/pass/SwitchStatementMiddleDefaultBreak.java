package pass;

public class SwitchStatementMiddleDefaultBreak {
    public int op(int i, int j) {
        // with break
        switch (i) {
            case 0: i = -1; break;
            default: i++; break;
            case 1: i = -2; break;
        }

        return i;
    }
}