
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
            // чем длина массива, то массив заполнится только введенными данными
            // остальные значения будут по умолчанию равны == 0

            if (numberString1.length <= sizeArray) {

                sizeArray = numberString1.length;   //  эта строчка нужна если (numberString1.length < sizeArray)
                                                    //  тогда массив будет заполнет только тем количеством
                                                    //  элементов, сколько их ввел пользователь с консоли

                // Преобразование строчного массива в Int, и копирование результата в int массив array

                for (int i = 0; i < sizeArray; i++) {
                    array[i] = Integer.parseInt(numberString1[i]);
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
                }


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