import java.util.Scanner;

/**
 * Created by Ani on 06-Nov-15.
 */
public class checkName {
    public static void main(String[] args){
        System.out.println("Please enter your name?");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();

        System.out.printf("Your name is " + userInput + ". Is that correct? "); /* Notes p.1*/
        System.out.println("please write \"y\" for Yes and \"n\" for No."); /* Notes p.2*/

        Scanner secondCorrectness = new Scanner(System.in);
        String answer = secondCorrectness.nextLine();

        if ("y".equals(answer))/* Notes p.3*/ {
            System.out.println("Hello, " + userInput);
        }
        else{
            System.out.println("Please enter your name again: ");
            Scanner input2 = new Scanner(System.in);
            String nameAgain = input2.nextLine(); /* Notes p.4*/
            System.out.println("Hello, " + nameAgain);
        }
    }
}

/* Notes:
1. Printing variable value and text: System.out.println("Hello, " + userInput);
2. Escape characters \ for the quotes
3. Check if user input is equal to a specific string/char: if ("y".equals(answer)), i.e.
if ("desiredAnswer".equals(userInputVariable))
4. create a Scanner = NEW Scanner(System.IN) and then create a variable with a name and
assign the ScannerName.nextLine() and use the variable name to print when printing, instead of the Scanner name.
 */


/* OUTPUT if ans N:
Please enter your name?
gosho
Your name is gosho. Is that correct? please write "y" for Yes and "n" for No.
n
Please enter your name again:
Ani
Hello, Ani
 */