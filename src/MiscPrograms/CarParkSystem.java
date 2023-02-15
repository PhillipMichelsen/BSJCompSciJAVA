package MiscPrograms;
import java.util.Scanner;
import java.util.Random;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class CarParkSystem {
    public static void main(String[] args) {
        String[][] carPark = new String[100][3];
        int currentCar = 0;

        while (true) {
            System.out.println("---------- CAR PARK SYSTEM ----------");
            System.out.println("1. Enter car");
            System.out.println("2. Exit car");
            System.out.println("3. Display all cars");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter choice: ");
            String choice = scanner.nextLine();
            System.out.println("\n\n");


            switch (choice){
                // Enter car
                case "1":
                    System.out.println("---------- CAR PARK SYSTEM ----------");
                    System.out.println("         || Enter carpark ||         ");

                    if (isFull(carPark)) {
                        System.out.println("Car park is full! Try again later.");
                        System.out.println("\n\n");
                        break;
                    }

                    String code = generateCode();
                    carPark[currentCar][0] = code;

                    String inTime = getTime();
                    carPark[currentCar][1] = inTime;

                    currentCar++;

                    System.out.println("\n-- Car logged: --");
                    System.out.println("Code: " + code);
                    System.out.println("Time of entry: " + inTime);

                    System.out.println("\n\n");
                    break;

                // Exit car
                case "2":
                    System.out.println("---------- CAR PARK SYSTEM ----------");
                    System.out.println("         || Leave carpark ||         ");

                    System.out.print("\nEnter car code: ");
                    String carCode = scanner.next();

                    int carIndex = -1;
                    for (int i = 0; i < carPark.length; i++) {
                        if (carPark[i][0] == null) {
                            continue;
                        }

                        if (carPark[i][0].equals(carCode)) {
                            carIndex = i;
                            break;
                        }
                    }

                    if (carIndex == -1) {
                        System.out.println("Car not found! Try again.");
                        System.out.println("\n\n");
                        break;
                    }

                    String outTime = getTime();
                    carPark[carIndex][2] = outTime;

                    int hours = getHours(carPark[carIndex][1], carPark[carIndex][2]);

                    if (hours < 1) {
                        System.out.println("Invalid time! Try again.");
                        System.out.println("\n\n");
                        break;
                    }

                    float charge = calculateCharge(hours);

                    System.out.println("\n-- Car information updated: --");
                    System.out.println("Code: " + carCode);
                    System.out.println("Time of entry: " + carPark[carIndex][1]);
                    System.out.println("Time of exit: " + carPark[carIndex][2]);
                    System.out.println("\nHours parked: " + hours);
                    System.out.println("Charge: " + charge);

                    // Clear car information, reset counter
                    carPark[carIndex][0] = null;
                    carPark[carIndex][1] = null;
                    carPark[carIndex][2] = null;
                    currentCar = carIndex;

                    System.out.println("\n\n");
                    break;

                // Display all cars
                case "3":
                    System.out.println("---------- CAR PARK SYSTEM ----------");
                    System.out.println("         || Display info ||         ");

                    for (int i = 0; i < carPark.length; i++) {
                        if (carPark[i][0] == null) {
                            continue;
                        }

                        System.out.println("\n--- Car " + (i + 1) + " ---");
                        System.out.println("Code: " + carPark[i][0]);
                        System.out.println("Time of entry: " + carPark[i][1]);
                    }

                    System.out.println("\n\n");
                    break;

                // Exit program
                case "4":
                    System.out.println("########## Exiting! ##########");
                    System.exit(0);

                // Invalid choice
                default:
                    System.out.println("Invalid choice! Try again.");
                    System.out.println("\n\n");
            }

        }
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

    // Get current time
    public static String getTime() {
        /*
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = time.format(formatter);
        return formattedTime;
        */

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter current time (HH:mm): ");
        return scanner.nextLine();
    }

    // Calculate hours parked
    public static int getHours(String inTime, String outTime) {
        int inHour = Integer.parseInt(inTime.substring(0, 2));
        int outHour = Integer.parseInt(outTime.substring(0, 2));

        int hours = outHour - inHour;

        if (hours == 0) return 1;
        return hours;
    }

    // Calculate charge
    public static float calculateCharge(int hours) {
        float charge;

        if (hours == 1) {
            charge = 3;
        } else {
            charge = 3 + (hours - 1) * 2.5f;
        }
        return charge;
    }

    // Check if car park is full
    public static Boolean isFull(String[][] carPark) {
        for (String[] car : carPark) {
            if (car[0] == null) {
                return false;
            }
        }
        return true;
    }
}
