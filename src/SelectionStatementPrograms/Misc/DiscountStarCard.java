package SelectionStatementPrograms.Misc;
import java.util.Scanner;

public class DiscountStarCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amountSpent = 0, totalBill, discount = 0, discountRecieved = 0;
        int cardStars;
        boolean salePeriod = false;

        System.out.print("Input amount spent: ");
        amountSpent = sc.nextDouble();

        System.out.print("Input amount of stars on card (0 if no card): ");
        cardStars = sc.nextInt();

        System.out.print("Is it a sale period? (Yes/No): ");
        String salePeriodString = sc.next();
        if (salePeriodString.equalsIgnoreCase("Yes")) salePeriod = true;

        if (cardStars > 0) {
            if (cardStars == 3) discount = 0.03;
            else if (cardStars == 7) discount = 0.10;

            if (salePeriod) discount += 0.50;
        }

        discountRecieved = amountSpent * discount;
        totalBill = amountSpent - discountRecieved;

        System.out.println("\nTotal bill: " + totalBill);
        System.out.println("Discount received: " + discountRecieved);
    }
}
