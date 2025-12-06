package pass;

public class IfStatement {
    public static boolean op1(int a) {
        if (a == 0) return 0;
        return 1;
    }

    public static boolean op2(int a) {
        if (a == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean op3(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}