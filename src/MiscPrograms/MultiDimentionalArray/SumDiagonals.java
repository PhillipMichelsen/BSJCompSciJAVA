package MiscPrograms.MultiDimentionalArray;
import java.util.Scanner;
import java.util.Random;

public class SumDiagonals {
    public static void main(String[] args) {
        Random random = new Random(101);
        Scanner sc = new Scanner(System.in);
        int sum1 = 0, sum2 = 0;

        // Generate and fill a 2D array with random numbers (With seed 101)
        int [][] twoDimentionalArray = new int[5][5];

        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                twoDimentionalArray[row][column] = random.nextInt(100);
            }
        }

        // Print array
        for (int row = 0; row < twoDimentionalArray.length; row++) {
            for (int column = 0; column < twoDimentionalArray[row].length; column++) {
                System.out.print(twoDimentionalArray[row][column] + " ");
            }
            System.out.println();
        }


        // Sum of elements for both diagonals
        for (int diagonal = 0; diagonal < twoDimentionalArray.length; diagonal++) {
            sum1 += twoDimentionalArray[diagonal][diagonal];
            sum2 += twoDimentionalArray[diagonal][(twoDimentionalArray.length - 1) - diagonal];
        }

        System.out.println("\nSum of diagonal elements (Top left to bottom right): " + sum1);
        System.out.println("Sum of diagonal elements (Top right to bottom left): " + sum2);

    }
}
