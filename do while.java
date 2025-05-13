import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int num = 0;
        
        do{
            System.out.print("Enter a number between 1 - 10: ");
            num = scanner.nextInt();
        }while(num < 1 || num > 10);
        
        System.out.println("You picked " + num);
        
        scanner.close();
    }   
}