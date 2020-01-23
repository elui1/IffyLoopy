import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loopy();
        System.out.println();
        iffyLoop();
    }

    public static void loopy() {
        Scanner console = new Scanner(System.in);
        String input = "";
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a word: ");
            input = input + console.next();
        }
    }

    public static void iffyLoop() {
        Scanner input = new Scanner(System.in);
        boolean redEyes = false;
        String repeat = "y";

            while (repeat.equalsIgnoreCase("y")) {
            System.out.print("Are your eyes red? ");
            String answer = input.next();

            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                redEyes = true;
            }
            else {
                redEyes = false;
            }

            if (redEyes) {
                System.out.println("Get some sleep!");
            }
            else {
                System.out.println("You look great!");
            }

            System.out.print("Do you want to try again? (Y/N) ");
            repeat = input.next();

        }
    }
}
