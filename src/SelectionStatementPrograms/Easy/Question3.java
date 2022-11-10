package SelectionStatementPrograms.Easy;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userAge, userDiscount; // Initialize variables

        System.out.print("Enter your age: "); // User input
        userAge = sc.nextInt();

        if (userAge >= 13 && userAge <= 15) userDiscount = 30; // Declare conditions
        else if (userAge >= 16 && userAge <= 17) userDiscount = 20;
        else if (userAge >= 50) userDiscount = 40;
        else userDiscount = 0;

        System.out.printf("You will receive a %d%% discount.", userDiscount); // Print to user
    }

    public static void question(){
        System.out.println("'Write a program that takes an age and prints the discount rate.'");
    }
}
