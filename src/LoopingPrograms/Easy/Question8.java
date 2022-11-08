package LoopingPrograms.Easy;
import java.util.Random;

public class Question8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] carSpeeds = new int[100];
        int maxSpeed, minSpeed, averageSpeed = 0;


        for (int i = 0; i < 100; i++) {
            carSpeeds[i] = rand.nextInt(160);
        }

        maxSpeed = carSpeeds[0];
        minSpeed = carSpeeds[0];


        for (int speed : carSpeeds) {
            if (speed > maxSpeed) maxSpeed = speed;
            if (speed < minSpeed) minSpeed = speed;

            averageSpeed += speed;
        }

        averageSpeed /= carSpeeds.length;

        System.out.printf("Max speed was %d. \nMin speed was %d. \nAverage speed was %d.", maxSpeed, minSpeed, averageSpeed);

    }
}
