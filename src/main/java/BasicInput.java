import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int userInt;
        double userDouble;
        // TODO Define char and string variables similarly

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();

        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();

        System.out.println("Enter character:");
        char userChar = scnr.next().charAt(0);

        System.out.println("Enter string:");
        String userString = scnr.next();

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        int userDouble1 = (int) userDouble;

        System.out.println(userDouble + " cast to an integer is " + userDouble1);

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}