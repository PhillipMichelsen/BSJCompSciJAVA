package MiscPrograms.MultiDimentionalArray;

import java.util.Scanner;
import java.util.Random;

public class RentsQuestion {

    public static void main(String[] args) {
        int[][] rents = new int[4][3];
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();



        for (int floor = 0; floor < 4; floor++) {
            for (int bedroom = 0; bedroom < 3; bedroom++) {
                rents[floor][bedroom] = rand.nextInt(200, 2000);
            }
        }

        // Print rents
        for (int floor = 0; floor < 4; floor++) {
            for (int bedroom = 0; bedroom < 3; bedroom++) {
                System.out.print(rents[floor][bedroom] + " ");
            }
            System.out.println();
        }

        // Get rent
        System.out.print("\nEnter floor number: ");
        int floor = sc.nextInt();
        System.out.print("Enter bedroom number: ");
        int bedroom = sc.nextInt();

        System.out.printf("\nRent for floor %d with %d bedroom: %d", floor, bedroom, rents[floor][bedroom]);


        // Get average rent
        avgRent(rents);

    }

    public int getRent(int[][] rents, int floor, int bedroom) {
        return rents[floor][bedroom];
    }

    static void avgRent(int[][] rents) {
        int total = 0;
        for (int floor = 0; floor < 4; floor++) {
            for (int bedroom = 0; bedroom < 3; bedroom++) {
                total += rents[floor][bedroom];
            }
        }
        System.out.println("\nAverage rent: " + total / 12);
    }



}
