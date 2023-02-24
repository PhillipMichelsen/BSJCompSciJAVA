package MiscPrograms.Methods;
import java.util.Scanner;

public class DesiBin {
    public static void main(String[] args) {
        int num;
        long binary;

        num = getNum();
        binary = convertToBinary(num);

        printBinary(binary);
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        return scanner.nextInt();
    }

    public static int convertToBinary(int num) {
        int binary = 0;
        int remainder = 0;
        int i = 1;

        while (num != 0) {
            remainder = num % 2;
            num /= 2;
            binary += remainder * i;
            i *= 10;
        }

        return binary;
    }

    public static void printBinary(long binary) {
        System.out.println("Binary: " + binary);
    }
}
