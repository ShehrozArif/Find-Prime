package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter range to find prime: ");
        int primeRange = userInput.nextInt();
        System.out.println("Enter nos of prime to find: ");
        int primeCount = userInput.nextInt();

        int prime[] = new int[primeCount];


        for (int i = 3; i < primeRange; i++) {
            boolean isPrime = true;
            int c = i / 2;
            for (int j = 2; j <= c; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && counter < primeCount) {
                prime[counter] = i;
                counter++;
            }
        }
        for (int p : prime) {
            System.out.println(p);
        }
    }
}
