public class Ex5_1 {
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        double base = 5.0;
        double height = 10.0;

        double area = calculateTriangleArea(base, height);

        System.out.println("The area of the triangle is: " + area);
    }
}
