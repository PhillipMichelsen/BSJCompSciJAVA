package SelectionStatementPrograms.Medium;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passengerCount;
        float totalFare, journeyDistance;
        totalFare = 0;

        System.out.print("How many passengers are there?: ");
        passengerCount = sc.nextInt();

        System.out.print("What is the distance of the journey?: ");
        journeyDistance = sc.nextFloat();

        // First kilometer charged at $3
        totalFare += 3;

        if (journeyDistance >= 1) {
            // Following distance charged at $2
            totalFare += (journeyDistance - 1) * 2;

            //Multiply by passenger count
            totalFare *= passengerCount;

            if (passengerCount > 5) totalFare *= 1.5;

        }

        System.out.printf("Your fare is $%.2f", totalFare);

    }
}
