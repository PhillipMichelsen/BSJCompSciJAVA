package MiscPrograms.Methods;
import java.util.Scanner;


public class DesiBin {
    public static void main(String[] args) {
        DesiBinOperations desiBinOperations = new DesiBinOperations();

        int num;
        long binary;

        num = desiBinOperations.getNum();
        binary = desiBinOperations.convertToBinary(num);

        desiBinOperations.printBinary(binary);
    }
}

class DesiBinOperations {
    public int getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        return scanner.nextInt();
    }

    public int convertToBinary(int num) {
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

    public void printBinary(long binary) {
        System.out.println("Binary: " + binary);
    }
}
