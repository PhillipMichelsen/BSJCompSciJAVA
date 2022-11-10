package LoopingPrograms.Medium;
import java.util.Random;

public class Question12 {
    public static void main(String[] args) {
        int[] housePrices = new int[5000];
        int housesTaxPaid = 0, totalTaxCollected = 0;

        for (int i = 0; i < housePrices.length; i++) {
            housePrices[i] = new Random().nextInt(500000 - 15000) + 15000;
        }

        for (int housePrice : housePrices) {
            if (housePrice > 200000) {
                totalTaxCollected += housePrice * 0.02;
                housesTaxPaid++;
            }
            else if (housePrice > 100000) {
                totalTaxCollected += housePrice * 0.015;
                housesTaxPaid++;
            }
            else if (housePrice > 50000) {
                totalTaxCollected += housePrice * 0.01;
                housesTaxPaid++;
            }
        }

        System.out.println("Total tax collected: " + totalTaxCollected);
        System.out.println("Number of houses that paid tax: " + housesTaxPaid);
    }

    public static void question() {
        System.out.println("'Write a program to read the price of 5000 houses and print the total tax collected and the number of houses that paid tax.'");
    }
}
