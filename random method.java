import java.util.Random;
class Main {
    public static void main(String[] args) {
        
        Random random = new Random();
        
        /*int a, b, c;
        
        a = random.nextInt(1,100);
        b = random.nextInt(1,100);
        c = random.nextInt(1,100);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */
        
        boolean isGreen;
        
        isGreen = random.nextBoolean();
        
        if(isGreen) {
            System.out.println("The color is green!");
        }
        else{
            System.out.println("The color is red!");
        }
    }
}