import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        
        System.out.println("Your age is: " + age);
        System.out.println("You like the color: " + color);
        
        scanner.close();
    }
}