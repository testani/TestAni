import java.util.Scanner;

/**
 * Created by Ani on 08-Nov-15.
 */
public class Triangle {
    public static void main(String[] args){
        System.out.println("Enter a number less than 26: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        //char firstChar = 'a';

        for (int i = 1; i <= userInput; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //System.out.println("Char - " + userInput);
    }
}
