package fail;

public class UndeclaredVariable {
    public static void main(String[] args) {
        x = 10;
        int y = x + 2;
        int z = x + x;
    }
}