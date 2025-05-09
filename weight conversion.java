import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        //WEIGHT CONVERSION PROGRAM
        
        Scanner scanner = new Scanner(System.in);
        
        double weight;
        double newWeight;
        int choice;
        
        System.out.println("Weight Conversion Program");
        System.out.println("Option 1: lbs to kgs");
        System.out.println("Option 2: kgs to lbs");
        
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();
        
        if(choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            
            newWeight = weight * 0.453592;
            
            System.out.printf("%.2f lbs equals %.2f kgs", weight, newWeight);
        }
        else if(choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            
            newWeight = weight * 2.20462;
            
            System.out.printf("%.2f kgs equals %.2f lbs", weight, newWeight);
        }
        else{
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
        
    }   
}