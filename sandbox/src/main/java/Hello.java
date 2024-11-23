import java.io.File;

public class Hello {
    public static void main(String[] args) {
        try {
            int z = calculate();
        } catch (ArithmeticException exception){
            exception.printStackTrace();
        }
    }

    private static int calculate() {
        var x = 1;
        var y = 0;
        int z = divide(x, y);
        return z;
    }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;
    }
}
