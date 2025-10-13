package pass;

public class BitwiseCombination {
    public static int AndOr(int a, int b, int c) {
        return a & b | c;
    }

    public static int OrAnd(int a, int b, int c) {
        return a | b & c;
    }

    public static int XorAndOr(int a, int b, int c, int d) {
        return a ^ b & c | d;
    }

    public static int AndOrXor(int a, int b, int c, int d) {
        return a & b | c ^ d;
    }

    public static int OrXorAnd(int a, int b, int c, int d) {
        return a | b ^ c & d;
    }

    public static int AndAnd(int a, int b, int c) {
        return a & b & c;
    }

    public static int OrOr(int a, int b, int c) {
        return a | b | c;
    }

    public static int XorXor(int a, int b, int c) {
        return a ^ b ^ c;
    }
}
