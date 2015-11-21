package com.company;

import java.util.Scanner;
import java.util.Random;
/**
 * Created by Ani on 20-Nov-15.
 */
public class randomNums {
    public static void main(String[] args) {
        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int one = input.nextInt(); // keep first value in variable "one"
        int two = input.nextInt(); // keep second value in variable "two"
        Random generator = new Random();

        // check which of the two numbers is bigger
        if (one < two) {
            // giving the range to be between the bigger and the smaller number + 1
            int range = two - one + 1;
            // for every i, starting from the value of "one" until the value of "two", generate a random number
            for (int i = one; i < two; i++) {
                int randomNum =  generator.nextInt(range) + one;
                System.out.println("Random No: " + randomNum);
            }
        }
        else{
            int range = one - two + 1;
            for (int i = two; i < one; i++) {
                int randomNum =  generator.nextInt(range) + two;
                System.out.println("Random No: " + randomNum);
            }
        }
    }
}
