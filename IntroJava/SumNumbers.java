import java.util.Scanner;

/**
 * Created by Ani on 08-Nov-15.
 */
public class SumNumbers {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("The sum from 1 to your number incl. is: " + sum);
    }
}

/* Create a Java program that reads a number N from the console and calculates the sum of all numbers from 1 to N (inclusive). */