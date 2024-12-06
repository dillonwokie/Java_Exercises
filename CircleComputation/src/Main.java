import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = Double.parseDouble(input.nextLine());

        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius,2);
        circumference = 2 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);

    }
}