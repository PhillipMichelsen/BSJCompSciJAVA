package LoopingPrograms.Medium;
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookCount = 0, mapCount = 0, magazineCount = 0;
        String productCode;

        while (true){
            System.out.print("Enter product code: ");
            productCode = sc.nextLine();

            if (productCode.length() != 4) {
                System.out.println("Invalid code. Please try again.\n");
            } else {
                if (productCode.equals("9999")) {
                    break;
                }

                if (productCode.charAt(0) == '1') {
                    bookCount++;
                } else if (productCode.charAt(0) == '2') {
                    magazineCount++;
                } else if (productCode.charAt(0) == '3') {
                    mapCount++;
                }
            }
        }

        System.out.println("\nBooks: " + bookCount);
        System.out.println("Magazines: " + magazineCount);
        System.out.println("Maps: " + mapCount);
    }
}
