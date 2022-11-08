package SelectionStatementPrograms.Easy;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: "); // User input
        int userNum = sc.nextInt();

        if ((userNum % 2) == 0){ // Check if even
            System.out.printf("%d is an even number.", userNum); // Print to user
        }
        else{
            System.out.printf("%d is an odd number.", userNum);
        }
    }
}
