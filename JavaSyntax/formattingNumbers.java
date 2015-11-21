import javax.swing.*;
import java.util.Scanner;


public class formattingNumbers {
    public static void main(String[] args) {
        System.out.print("Type an INT number \"a\", such that 0 < a < 500: ");
        Scanner input1 = new Scanner(System.in);
        int firstNum = Integer.parseInt(input1.nextLine());
        String firstNumHex = Integer.toHexString(firstNum).toUpperCase();     // convert to Hexadecimal, has to be left aligned
        System.out.println();
        String firstNumBinary = String.format("%10s", Integer.toBinaryString(firstNum)).replace(" ", "0"); /* formatting the string from string to Binary while passing from Integer to
        binary. Replacing any possible spaces at the beginning with zeros in case the number has less than 10 characters*/

        System.out.printf("Hexadecimal: 0x%s", firstNumHex); // print A in Hexadecimal 0xA
        System.out.println();
        System.out.printf("Binary: %s \n\n", firstNumBinary); // print A in binary
        // Note 1

        // prompting for floating point number B
        System.out.print("Type a FLOAT number \"b\": ");
        Scanner input2 = new Scanner(System.in);
        double secondNum = input2.nextFloat();
        System.out.printf("With 2 digits after floating point: %.2f \n\n", secondNum);

        System.out.print("Type a FLOAT number \"c\": ");
        Scanner input3 = new Scanner(System.in);
        double thirdNum = input3.nextFloat();
        System.out.printf("With 3 digits after floating point: %.3f\n\n", thirdNum);

        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f", firstNumHex, firstNumBinary, secondNum, thirdNum);
    }
}

/*  print 2 numbers as below:
    a	b   	c	|aHex      |aBinary|            b|c         |
    254	11.6	0.5	|FE        |0011111110|     11.60|0.500     |


NOTES:
1. \n is a NEW LINE, %s is placeholder for string, %d is a placeholder for int variables, %f is for float variables
2. To ensure we have 2 signs after the floating point, add placeholder %.2f
3. Integer.toWHATEVER is a way to convert one integer to binary, hex or string
4. .replace(" ", "0"); - function that replaces one char with another .replace("OriginalChar", "ReplaceWithThisChar"); Used for strings

*/