package pass;

public class ParenthesesExpression {
    public int a() {
        return 1 + 2 / (3 * 4);
    }

    public int b() {
        return 1 + (2 / 3) * 4;
    }

    public int c() {
        return (1 + 2) / 3 * 4;
    }

    public int flip1(boolean b) {
        return !b;
    }

    public int flip2(boolean b) {
        return !(b);
    }
}