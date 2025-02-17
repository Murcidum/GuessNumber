package org.example;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctNumb = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int maxAttempt = 7;
        int userAttempt = 0;
        System.out.println("""
                Rules:\s
                The computer guesses a number from 1 to 100
                Your task is to guess which number the computer has guessed
                You have only 7 tries
                If you answer incorrectly, the computer tells you whether the number you guessed is greater or less than your number.""");

        System.out.println("Game starting\n" + "Write your first number:");

        int userNumb = scanner.nextInt();
        while (userAttempt <= maxAttempt) {
            userAttempt = userAttempt + 1;

            if (userNumb < correctNumb){
                System.out.println("Guessing number is bigger than your. Write your next number:");
                userNumb = scanner.nextInt();
            } else if (userNumb > correctNumb) {
                System.out.println("Guessing number is lower than your. Write your next number:");
                userNumb = scanner.nextInt();
            } else {
                System.out.println("You win");
                break;
            }

        }

    }
}