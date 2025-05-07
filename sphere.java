import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        //Circumference = 2 * Math.PI * radius
        //Area = Math.PI * Math.pow(radius, 2)
        //Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
        
        Scanner scanner = new Scanner(System.in);
        
        double radius, circumference, area, volume;
        
        System.out.print("Enter value of radius: ");
        radius = scanner.nextDouble();
        
        circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference);
        
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + area);
        
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume: " + volume);
        
        scanner.close();
        
    }
}