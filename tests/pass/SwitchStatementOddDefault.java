package pass;

public class SwitchStatementOddDefault {
    public static int op(int a) {
        int a = 0;

        switch(a) {
            case 0: a++;
            case 1: a++;
            case 2: a++;
            default: a++; break;
            case 3: a++;
            case 4: a++;
            case 5: a++;
            case 5: a++;
        }

        int b = a;

        switch(b) {
            default: a++;
            case 0: a++;
            case 1: a++;
            case 2: a++;
            case 3: a++;
            case 4: a++;
            case 5: a++;
            case 5: // a++;
        }

        return a;
    }
}