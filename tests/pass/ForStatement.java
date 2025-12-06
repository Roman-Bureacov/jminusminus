package pass;

public class ForStatement {
    public static int op1(int a, int b) {
        for (int i = 0; i < a; i++) {
            b++;
        }

        return b;
    }

    public static int op2(int a, int b, int c) {
        for (int i = 0; i < a; i += b) {
            c++;
        }

        return c;
    }

    public static int op3(int a, int b, int c) {
        for (int i = 0, j = b; i < a && j > 0; i++, j--) {
            c++;
        }

        return c;
    }

    public static void op4() {
        for (;;); // note that this WILL infinitely loop
    }
}