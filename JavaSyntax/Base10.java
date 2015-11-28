package com.company;

import java.util.Scanner;
import java.io.*;

/**
 * Created by Ani on 28-Nov-15.
 */
public class Base10 {
    public static void main(String[] args) {
        System.out.println("Enter a number to be converted to Base 10 and then to Base 7: ");

        Scanner input = new Scanner(System.in);

        int numInBase7 = Integer.parseInt(input.nextLine(),7);
        String numInBase10 = Integer.toString(numInBase7, 10);

        System.out.println("In base 10: " + numInBase10);
    }
}


/*
        Scanner scanner = new Scanner(System.in);

        int numberInBase7 = Integer.parseInt(scanner.nextLine(), 7);
        String numberInDecimal = Integer.toString(numberInBase7, 10);

        System.out.println(numberInDecimal);
*/