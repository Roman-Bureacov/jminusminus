package fail;

public class LessThanOperator {
    public static void main(String[] args) {
        boolean a = "Z" < 3;
        boolean b = 5 < "a";
        boolean c = a < b;
    }
}