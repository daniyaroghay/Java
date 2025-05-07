import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        String name = "Ahmed";
        char firstLetter = 'A';
        int age = 21;
        double height = 173.5;
        boolean isEmployed = true;
        
        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with a/an %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f cm tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        
        System.out.printf("%s is %d years old", name, age);
        
    }
}