package MiscPrograms;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CarParkSystem {
    public static void main(String[] args) {
        System.out.println(generateCode());
        System.out.println(getInTime());
    }


    // Generate random code
    public static String generateCode() {
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            int randomInt = random.nextInt(26);
            char currentCharacter = (char) (randomInt + 65);
            code += currentCharacter;
        }
        return code;
    }

    // Get current time, inTime
    public static String getInTime() {
        /*
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = time.format(formatter);
        return formattedTime;
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in time: ");
        return scanner.nextLine();
    }

    // Get current timem outTime
    public static String getOutTime() {
        /*
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = time.format(formatter);
        return formattedTime;
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter out time: ");
        return scanner.nextLine();
    }

    // Calculate hours parked
    public static int getHours(String inTime, String outTime) {
        int inHour = Integer.parseInt(inTime.substring(0, 2));
        int outHour = Integer.parseInt(outTime.substring(0, 2));
        return outHour - inHour;
    }

    






}
