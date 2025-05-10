import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String day;
        
        System.out.print("What day is it?: ");
        day = scanner.nextLine();
        
        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday.");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend.");
            default -> System.out.println(day + " is not a day!");
        }
        
        scanner.close();
        
    }   
}