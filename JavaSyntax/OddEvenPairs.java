package com.company;

import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Ani on 28-Nov-15.
 */
public class OddEvenPairs {
    public static void main(String[] args) {
        System.out.printf("Enter a few integers separated by space: ");
        Scanner input = new Scanner(System.in);

        String[] integers = input.nextLine().split(" ");

        for (int i = 0; i < integers.length; i+=2) {
            int num1 = Integer.parseInt(integers[i]);
            int num2 = Integer.parseInt(integers[i+1]);

            if (num1 % 2 == 1 && num2 % 2 == 1){
                System.out.println("Odd numbers: " + num1 + ", " + num2);
            }
            if (num1 % 2 == 0 && num2 % 2 == 0){
                System.out.println("Even numbers: " + num1 + ", " + num2);
            }
        }
    }
}
