import java.util.Scanner;

public class InputData {

    public static int numberInput () {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String stringInput () {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
