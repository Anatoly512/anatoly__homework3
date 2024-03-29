
public class Main {

    ArrayLogic arrayLogic = new ArrayLogic();
    public static boolean zeroIf;                     //  Эта переменная нужна чтобы понять, вводил ли пользователь
                                                      //  хоть одно число 0. Тогда оно будет учитываться в рассчетах.

    public static void main(String[] args) {
        Main doChoice = new Main();
        doChoice.choice();

    }

    private void choice () {
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
            // чем длина массива, то массив заполнится только введенными данными
            // остальные значения будут по умолчанию равны == 0

            if (numberString1.length <= sizeArray) {

                sizeArray = numberString1.length;   //  эта строчка нужна если (numberString1.length < sizeArray)
                                                    //  тогда массив будет заполнет только тем количеством
                                                    //  элементов, сколько их ввел пользователь с консоли

                // Преобразование строчного массива в Int, и копирование результата в int массив array

                for (int i = 0; i < sizeArray; i++) {
                    array[i] = Integer.parseInt(numberString1[i]);
                    if (array[i] == 0) zeroIf = true;
                }

                doingArray(array);
            }

            /*  Пользователь может ввести и бОльшее количество аргументов, чем он вначале заявил, задавая
            //  длину массива. Тогда (если сейчас оставить код как есть) будет учитываться ровно столько аргументов,
            //  сколько соответствует изначально заданному пользователем размеру массива, а все лишние будут отброшены

            //  Но можно и усложнить вариант:
            //  в случае, если пользователь ввел бОльшее количество аргументов, чем он вначале заявил,
            //  тогда можно заново инициализировать массив   */

            if (numberString1.length > sizeArray) {
                sizeArray = numberString1.length;
                int[] array2 = new int[sizeArray];

                for (int i = 0; i < sizeArray; i++) {                    //  sizeArray здесь равен именно реальной
                    array2[i] = Integer.parseInt(numberString1[i]);      //  длине массива (numberString1.length);
                    if (array2[i] == 0) zeroIf = true;
                }

                doingArray(array2);    //  Здесь передается аргументом именно новый массив array2
                                       //  чей размер соответствует реально введенному пользователем
                                       //  количеству цифр с консоли
            }


        }

        else {
            // COMPLICATED variant
            // пользователь просто вводит в массив данные в любом количестве аргументов
            // а массив создается сразу соответствующего размера

            if (variant == 2) {

            System.out.print("\n\nPlease, fill the ARRAY by numbers (use SPACE key beetwen numbers) :  ");

            // пользователь вводит сразу данные в массив одной строкой (через пробел)

                String numberString = InputData.stringInput();
                String[] numberString1 = numberString.split(" ");

            // Создание массива требуемого размера
                int sizeArray = (numberString1.length);
                int[] array = new int[sizeArray];


               // Преобразование строчного массива в Int, и копирование результата в int массив array

                for(int i = 0; i < sizeArray; i++) {                 // sizeArray здесь равен numberString1.length
                    array[i] = Integer.parseInt(numberString1[i]);
                    if (array[i] == 0) zeroIf = true;
                }


             doingArray(array);

            }
            else {
                System.out.println("\nYou can choose numbers 1  or  2 !");
                choice();
            }
        }
    }


    private void doingArray(int... array) {

        {   //  Подсчет количества повторений числа 5
            int number = 5;
            int counter = arrayLogic.SearchNumber(number, array);
            if (counter == 0)
                System.out.println("\n" + "Number " + number + " is absent here.");
            else
                System.out.println("\n" + "Number " + number + " is counted " + counter + " times.");
        }


        //  Сортировка массива собственным методом (слева направо, по убыванию)
        //  и вывод максимального (минимального) числа в массиве

        arrayLogic.MySortArray(array);


        //  Сортировка массива стандартным методом Arrays.sort() и вывод на экран с методом toString
        arrayLogic.SortArray(array);


        //  Вывод максимального (минимального) значения повторений чисел в массиве
        arrayLogic.PrintMaxMinNumbers(array);


        //  System.out.println();              //  Нужно только для фазы тестирования
        //  arrayLogic.DisplayArray(array);    //  Нужно только для фазы тестирования

    }

}

//  Домашняя работа 3
