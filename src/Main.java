
public class Main {
    public static void main(String[] args) {
        new InputData();
        choice();

    }

    private static void choice () {
        System.out.print("\nPlease, enter variant  SIMPLE  -  1      ");
        System.out.print("\n              or  COMPLICATED  -  2   :  ");
        int variant = InputData.numberInput();

        if (variant == 1) {
            // SIMPLE variant
            // пользователь явно задает длину массива

            System.out.print("\n\nPlease, enter ARRAY size  : ");
            int sizeArray = InputData.numberInput();
            int[] array = new int[sizeArray];  // Создание массива указанной пользователем длины

            System.out.print("\nPlease, fill the ARRAY by numbers (use SPACE key beetwen numbers) :  ");

            // Заполнение массива с консоли (разделитель - пробел)
            String numberString = InputData.stringInput();
            String[] numberString1 = numberString.split(" ");

            // Проверка:  если пользователь ввел меньшее количество аргументов с консоли
            // чем длина массива, то массив заполнится только введенными аргументами
            // остальные значения будут по умолчанию равны == 0

            if (numberString1.length < sizeArray) sizeArray = numberString1.length;

            // Преобразование строчного массива в Int, и копирование результата в int массив array

                for(int i = 0; i < sizeArray; i++) {                  //  sizeArray, а не numberString1.length
                    array[i] = Integer.parseInt(numberString1[i]);    //  чтобы не было выхода за рамки массива
                }


            doingArray(array);

        }

        else {
            // COMPLICATED variant
            // пользователь просто вводит в массив данные в любом количестве
            // а массив создается нужного размера

            if (variant == 2) {

            System.out.print("\n\nPlease, fill the ARRAY by numbers (use SPACE key beetwen numbers) :  ");

            // пользователь вводит сразу данные в массив одной строкой (через пробел)

                String numberString = InputData.stringInput();
                String[] numberString1 = numberString.split(" ");

            // Создание массива нужного размера
                int sizeArray = (numberString1.length);
                int[] array = new int[sizeArray];


                // Преобразование строчного массива в Int, и копирование результата в int массив array

                for(int i = 0; i < sizeArray; i++) {                 // sizeArray здесь равен numberString1.length
                    array[i] = Integer.parseInt(numberString1[i]);
                }

                /*
                // Вывод массива на экран (нужно только для фазы тестирования)
                System.out.println("\nARRAY  :   ");
                do
                {
                    System.out.println(array[sizeArray-1]);
                    sizeArray--;
                }
                while (sizeArray > 0);
                */


             doingArray(array);

            }
            else {
                System.out.println("\nYou can choose numbers 1  or  2 !");
                choice();
            }
        }
    }


    private static void doingArray (int ...array) {

        System.out.println("\nВыполнение  doingArray  ");

        // Вывод массива на экран (нужно только для фазы тестирования)

        System.out.println("\nARRAY  :   ");
        int m = array.length;

        do
        {
            System.out.println(array[m-1]);
            m--;
        }
        while (m > 0);

    }






}


//  Домашняя работа 3