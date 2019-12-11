
public class Main {
    public static void main(String[] args) {
        new InputData();
        choice1();

    }

    private static void choice1 () {
        System.out.print("\nPlease, enter variant  SIMPLE  -  1      ");
        System.out.print("\n              or  COMPLICATED  -  2)  :  ");
        int variant = InputData.numberInput();

        if (variant == 1) variant1();
        else {

            if (variant == 2) variant2();
            else {
                System.out.println("\nYou can choose numbers 1  or  2 !");
                choice1();
            }
        }
    }

    private static void variant1 () {
        System.out.println("\nVariant  1 ");
    }

    private static void variant2 () {
        System.out.println("\nVariant  2 ");
    }

}


//  Домашняя работа 3