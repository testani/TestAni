import java.util.Scanner;

    public class triangleArea {
    public static void main(String[] args) {
        System.out.println("Give number for Ax: ");
        Scanner input1 = new Scanner(System.in);
        float ax = input1.nextFloat();

        System.out.println("Give number for Ay: ");
        Scanner input2 = new Scanner(System.in);
        float ay = input2.nextFloat();

        System.out.println("Give number for Bx: ");
        Scanner input3 = new Scanner(System.in);
        float bx = input3.nextFloat();

        System.out.println("Give number for By: ");
        Scanner input4 = new Scanner(System.in);
        float by = input4.nextFloat();

        System.out.println("Give number for Cx: ");
        Scanner input5 = new Scanner(System.in);
        float cx = input5.nextFloat();

        System.out.println("Give number for Cy: ");
        Scanner input6 = new Scanner(System.in);
        float cy = input6.nextFloat();

        float formula = (ax*(by-cy)+bx*(cy-ay)+cx*(ay-by))/2;

        System.out.printf("The area for this triangle = %.0f", Math.abs(formula) );
    }
}


/*


 */