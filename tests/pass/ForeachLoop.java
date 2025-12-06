package pass;

public class ForeachLoop {
    public static int op() {
        int[] arr = new int[5];

        for (int a : arr) {
            a++;
        }

        return a[0];
    }
}