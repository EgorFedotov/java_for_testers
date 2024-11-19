public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
    }

    private static void printSquareArea(double side) {
        System.out.println("площать квадрата = " + squareArea(side));
    }

    private static double squareArea(double side) {
        return side * side;
    }
}
