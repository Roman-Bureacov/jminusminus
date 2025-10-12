package pass;

public class ConditionalCombination {
    /**
     *
     * @return a && b || c
     */
    public static boolean AndOr(boolean a, boolean b, boolean c) {
        return a && b || c;
    }

    /**
     *
     * @return a || b && c
     */
    public static boolean OrAnd(boolean a, boolean b, boolean c) {
        return a || b && c;
    }

    /**
     *
     * @return a && b || c && d
     */
    public static boolean AndOrAnd(boolean a, boolean b, boolean c, boolean d) {
        return a && b || c && d;
    }

    /**
     *
     * @return a || b && c || d
     */
    public static boolean OrAndOr(boolean a, boolean b, boolean c, boolean d) {
        return a || b && c || d;
    }

    /**
     *
     * @return !a && b
     */
    public static boolean NotAnd(boolean a, boolean b) {
        return !a && b;
    }

    /**
     *
     * @return a && !b
     */
    public static boolean AndNot(boolean a, boolean b) {
        return a && !b;
    }

    /**
     *
     * @return !a || b
     */
    public static boolean NotOr(boolean a, boolean b) {
        return !a || b;
    }

    /**
     *
     * @return a || !b
     */
    public static boolean OrNot(boolean a, boolean b) {
        return a || !b;
    }


}
