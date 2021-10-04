import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int programNumber = (int)(Math.random() * 101);
        int tries = 5;
        int num;
        do {
            tries--;
            System.out.println("Guess my number:");
            num = scanner.nextInt();
            if(num > programNumber) {
                System.out.println("My number is smaller. Left " + tries + " tries.");
            } else if(num < programNumber) {
                System.out.println("My number is bigger. Left " + tries + " tries.");
            } else {
                System.out.println("Congratulations! My number is " + num + ". You used " + (5 - tries) + " tries.");
            }
        } while (num != programNumber && tries > 0);
    }
}
