import java.util.Scanner;

public class rectangleArea {
    public static void main(String[] args) {
        System.out.println("Give the height \"h\" of the rectangle: ");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();

        System.out.println("Give the width \"w\" of the rectangle: ");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();

        int area = a*b;

        System.out.printf("The area of the rectangle with w = %d and h = %d is %d", a, b, area);
    }
}
