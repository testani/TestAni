package com.company;

import java.util.Scanner;

/**
 * Created by Ani on 20-Nov-15.
 */
public class Base7 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);

        // the next line indicated that the input STRING is Base 10
        int numBase10 = Integer.parseInt(input.nextLine(), 10);

        // then it converts the string numBase10 from Base 10 to Base 7
        String intToBase7 = Integer.toString(numBase10, 7);
        System.out.printf("Integer %d is equal to %s in Base 7.", numBase10, intToBase7);
    }
}
