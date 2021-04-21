package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static  void myRandom(int number){
        Scanner scanner = new Scanner(System.in);
        int numOfTry = 5;
        int guessedNumHolder = 0;
        int remainingGuess = 0;

        System.out.println("Enter your guessed number: ");
            while (numOfTry != 0){
                guessedNumHolder = scanner.nextInt();
                if (guessedNumHolder < number) {
                    System.out.println("guessed number is lesser than Actual number " + "\n" + "remaining guess attempt =  " + (numOfTry - 1)  +"\n" + "Please try Again"+"\n");
                } else if (guessedNumHolder > number) {
                    System.out.println("guessed number is greater than Actual number " + "\n" + "remaining guess attempt =  " + (numOfTry - 1) +"\n"+ "Please try Again"+"\n");
                } else {
                    System.out.println("Congratulations! you guessed right");
                    break;
                }
                numOfTry--;
            }
            System.out.println("Game Over!..  "+ "\n"+"Sorry you didn't guess the number, the answer was " + number );
        }
    }

