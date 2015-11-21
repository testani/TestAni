package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner input = new Scanner(System.in); // getting input of 3 numbers and assigning them to the vars a,b,c

        double a = input.nextFloat();
        double b = input.nextFloat();
        double c = input.nextFloat();

        // calculating formula 1 in 3 parts
        double formula1Base = ((a*a+b*b)/(a*a-b*b));
        double formula1Exponent = (a+b+c)/Math.sqrt(c);
        double formula1 = Math.pow(formula1Base, formula1Exponent);

        // calculating formula 2 in 2 parts
        double formula2Base = a*a+b*b-c*c*c;
        double formula2Exponent = a-b;
        double formula2 = Math.pow(formula2Base, formula2Exponent);

        // calculating average of abc and average of f1 and f2 and their difference
        double aveABC = (a+b+c)/3;
        double aveFomulas = (formula1+formula2)/2;
        double difference = aveABC-aveFomulas;

        // printing results of formulas and their result's difference
        System.out.printf("Result of formula 1: %.2f; Result of formula 2: %.2f; Difference: %.2f", formula1, formula2, Math.abs(difference));
    }
}

// Formula 1: ((a^2+b^2)/(a^2-b^2))^(a+b+c)/sqrt(c)
// Formula 2: (a^2+b^2-c^3)^(a-b)


// Math.Pow(Base,Exponent) - function for exponents
// Math.sqrt(number) - function for square root

