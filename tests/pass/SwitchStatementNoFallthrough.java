package pass;

public class SwitchStatementNoFallthrough {
    public static int op(int a) {
        int a = 0;

        switch(a) {
            case 0: a++; break;
            case 1: {
                a++;
                break;
            }
            case 2: a++;
            case 3: a++; break;
            case 4:
            case 5: a++; break;
            default: a++; break;
        }

        return a;
    }
}