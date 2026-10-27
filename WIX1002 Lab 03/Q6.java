import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the coordinate point (x y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        // Calculate squared distance from origin (0, 0)
        double distanceSquared = (x * x) + (y * y);
        double radiusSquared = radius * radius;
        
        if (distanceSquared <= radiusSquared) {
            System.out.println("The point (" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("The point (" + x + ", " + y + ") is outside the circle.");
        }
        scanner.close();
    }
}