package pass;

public class TryCatchManyFinally {
    public static int op(Object o) {

        try {
            o.toString();
        } catch (NullPointerException e) {
            return 1;
        } catch (RuntimeException e) {
            return 2;
        } catch (Exception e) {
            return 3;
        } finally {
            return 0;
        }

    }
}