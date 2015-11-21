import java.util.Scanner;

/**
 * Created by Ani on 09-Nov-15.
 */
public class Average {
    public static void main(String[] args){
        System.out.println("Enter 3 numbers: ");
        Scanner input1 = new Scanner(System.in);
        double num1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        double num2 = input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        double num3 = input3.nextDouble();

        double ave = (num1 + num2 + num3)/3;

        System.out.printf("The Average of your numbers is: %.2f", ave);
    }
}

// TO USE PLACEHOLDERS YOU MUST USE printF instead of printLN, add the placeholder and then out of the text,
// put a comma and then the variable to replace the placeholder.
