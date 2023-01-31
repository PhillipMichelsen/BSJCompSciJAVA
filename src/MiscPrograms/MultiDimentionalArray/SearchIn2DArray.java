package MiscPrograms.MultiDimentionalArray;
import java.util.Scanner;
import java.util.Random;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Random random = new Random(101);
        Scanner sc = new Scanner(System.in);

        // Generate and fill a 2D array with random numbers (With seed 101)
        int [][] twoDimentionalArray = new int[4][5];

        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                twoDimentionalArray[row][column] = random.nextInt(100);
            }
        }

        // Print array
        for (int[] ints : twoDimentionalArray) {
            for (int column = 0; column < ints.length; column++) {
                System.out.print(ints[column] + " ");
            }
            System.out.println();
        }

        // User input
        System.out.print("\nEnter a number: ");
        int userNum = sc.nextInt();

        // Search array for user input, error message if not found
        boolean found = false;
        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                if (twoDimentionalArray[row][column] == userNum) {
                    System.out.println("Found at row " + row + " and column " + column);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
