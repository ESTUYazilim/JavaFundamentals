import java.util.Scanner;

public class Exercise_001 {
    // final declared PI
    private static final double PI = Math.PI;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // declare scanner
        Scanner scanner = new Scanner(System.in);

        // print out and get radius
        System.out.println("What is the radius of circle?");
        float radius = scanner.nextFloat();

        // calculate perimeter of the circle
        double perimeter = calculateCirclePerimeter(radius);

        System.out.println("Perimeter of the circle is " + perimeter);
    }

    public static double calculateCirclePerimeter(float radius) {
        // fill out this method

        return 0; // and delete this return
    }
}
