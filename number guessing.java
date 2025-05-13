import java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        // Number Guessing Game
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int guess;
        int min = 1;
        int max = 100;
        int attempts = 0;
        int randomNum = random.nextInt(min, max + 1);
        
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d.\n", min, max);
        
        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if(guess < randomNum) {
                System.out.println("TOO LOW! Try again.");
            }
            else if(guess > randomNum){
                System.out.println("TOO HIGH! Guess again.");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNum);
                System.out.println("Number of attempts: " + attempts);
            }
        }while(guess != randomNum);
        
        scanner.close();
    }   
}