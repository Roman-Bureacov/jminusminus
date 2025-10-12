package pass;

public class ConditionalCombination {
    public static boolean AndOr(boolean a, boolean b, boolean c) {
        return a && b || c;
    }

    public static boolean OrAnd(boolean a, boolean b, boolean c) {
        return a || b && c;
    }

    public static boolean AndOrAnd(boolean a, boolean b, boolean c, boolean d) {
        return a && b || c && d;
    }

    public static boolean OrAndOr(boolean a, boolean b, boolean c, boolean d) {
        return a || b && c || d;
    }
}
