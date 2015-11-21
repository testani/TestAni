import java.util.Scanner;

/**
 * Created by Ani on 08-Nov-15.
 */
public class CheckIfOddOrEven {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num%2==1){
            System.out.println(num + " e nechetno chislo");
        }
        else{
            System.out.println(num + " e chetno chislo");
        }
    }
}
