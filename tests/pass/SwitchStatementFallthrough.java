package pass;

public class SwitchStatementFallthrough {
    public static int op(int a) {
        int a = 0;

        switch(a) {
            case 0: a++;
            case 1: a++;
            case 2: a++;
            case 3: a++;
            case 4: a++;
            case 5: a++;
            case 5: a++;
            default: a++;
        }

        int b = a;

        switch(b) {
            case 0: a++;
            case 1: a++;
            case 2: a++;
            case 3: a++;
            case 4: a++;
            case 5: a++;
            case 5: // a++;
            default: a++;
        }

        return a;
    }
}