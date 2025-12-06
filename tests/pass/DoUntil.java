package pass;

public class DoUntil {
    public static int op(int a) {
        int i = 0;
        do {
            i++;
        } until (i < a);

        return i;
    }
}