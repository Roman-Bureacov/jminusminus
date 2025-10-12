package pass;

/**
 * Class intended to test that all operators will compile successfully
 */
public class Operators {

    public static void main(String[] args) {
        // arithmetic operators
        int a;

        a = 3 + 3;
        a = a++;
        a = ++a;
        a += 3;
        a += a;

        a = 3 - 3;
        a = a--;
        a = --a;
        a -= 3;
        a -= a;

        a = 3 / 3;
        a /= 3;

        a = 3 * 3;
        a *= 3;

        a = 3 % 3;
        a %= 3;

        // boolean operators
        boolean b;

        b = 3 > 0;
        b = 3 >= 3;
        b = 3 < 0;
        b = 3 <= 0;
        b = 3 == 0;
    }
}
