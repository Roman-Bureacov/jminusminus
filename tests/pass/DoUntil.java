package pass;

public class DoUntil {
    public int op(int a) {
        int i = 0;
        do {
            i++;
        } until (i < a);

        return i;
    }
}