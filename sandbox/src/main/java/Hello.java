public class Hello {
    public static void main(String[] args) {
        var x = 1;
        var y = 0;
        if (y == 0) {
            System.out.println("Деление на 0 запрещено");
        } else {
            int z = divide(x, y);
            System.out.println(z);
            }
        }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;
    }
}
