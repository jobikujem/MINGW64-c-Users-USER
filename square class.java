import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
}

public class Square {
    private int sideLength;
    private int area;

    public Square(int initialLength) {
        sideLength = initialLength;
        area = sideLength * sideLength;
    }

    public void grow() {
        sideLength = 2 * sideLength;
    }

    public int getArea() {
        return area;
    }
}