package progexec;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for triangle sides
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();

        // Prompt user for color
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        // Prompt user for filled status
        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        // Create Triangle object with specified sides
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display triangle properties
        System.out.println("\nTriangle properties:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
