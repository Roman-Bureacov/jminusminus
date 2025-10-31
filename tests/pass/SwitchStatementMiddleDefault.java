package pass;

public class SwitchStatementMiddleDefault {
    public int op(int i, int j) {
        // without break
        switch (i) {
            case 0: i = -1;
            default: i++;
            case 1: i = -2;
        }

        return i;
    }
}