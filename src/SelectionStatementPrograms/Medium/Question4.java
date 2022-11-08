package SelectionStatementPrograms.Medium;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float employeeAllowance;

        System.out.print("Is the employee working full-time? (Y/N): ");

        if (sc.nextLine().equalsIgnoreCase("Y")) {
            employeeAllowance = 28 * 300;
        }
        else {
            float daysWorked;

            System.out.print("How many days a week do you work?: ");
            daysWorked = sc.nextFloat();

            employeeAllowance = (daysWorked/5) * 28 * 300;
        }

        System.out.printf("\nThe holiday allowance for this employee is $%.2f", employeeAllowance);
    }
}
