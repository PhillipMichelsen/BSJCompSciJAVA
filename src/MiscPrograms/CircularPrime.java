package MiscPrograms;
import java.util.Scanner;
import java.lang.Math;


public class CircularPrime {
    public static void main(String[] args) {
        int n = 197;
        int digits = 0;
        int currentRotation;
        int temp = n;

        for (int i = n; i > 0; i /= 10) {
            digits++;
        }

        int[] rotations = new int[digits];

        for (int i = 0; i < rotations.length; i++) {
            currentRotation = temp;

            // get last digit of number, store in temp
            temp = currentRotation % 10;

            // update current rotation by removing last digit
            currentRotation /= 10;

            // add last digit to front of number
            currentRotation += (temp * Math.pow(10, digits - 1));

            System.out.println(currentRotation);

            // store current rotation in array
            rotations[i] = currentRotation;
            temp = currentRotation;
        }


        // check if circular prime, print result
        boolean circularPrime = true;
        for (int rotation : rotations) {
            if (!isPrime(rotation)) {
                circularPrime = false;
                break;
            }
        }

        if (circularPrime) {
            System.out.println(n + " is a circular prime.");
        } else {
            System.out.println(n + " is not a circular prime.");
        }
    }

    static boolean isPrime(int num) {
        boolean prime = true;

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
