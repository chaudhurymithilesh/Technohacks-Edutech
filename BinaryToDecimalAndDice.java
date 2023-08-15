package task1;

import java.util.Scanner;
import java.util.Random;

public class BinaryToDecimalAndDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Binary to Decimal Converter and Dice Rolling Simulator");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Roll Dice");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("Choose an option (1/2/3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter a binary number: ");
                    int binaryInput = sc.nextInt();
                    int decimalOutput = binaryToDecimal(binaryInput);
                    System.out.println("Decimal equivalent: " + decimalOutput);
                    break;

                case 2:
                    rollDice();
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public static int binaryToDecimal(int n) {
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			mul=mul*2;
			n=n/10;
		}
        return sum;
    }

    public static void rollDice() {
        Random random = new Random();

        int die1Result = random.nextInt(6)+1;
        int die2Result = random.nextInt(6)+1;

        System.out.println("Die 1: " + die1Result);
        System.out.println("Die 2: " + die2Result);
        System.out.println("Total: " + (die1Result + die2Result));
    }
}

