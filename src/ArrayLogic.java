import java.util.Arrays;

public class ArrayLogic {

    public void MySortArray (int ...array) {
        //  Вывод максимального и минимального числа в массиве
        //  методом собственной сортировки массива (слева направо, по убыванию)

        int[] arrayCopy = new int[array.length];    // в arrayCopy будет храниться уже отсортированный массив

        arrayCopy = Arrays.copyOf(MySortArrayDoing(array), array.length);

        //  Теперь в массиве arrayCopy лежит отсортированный по убыванию массив

        System.out.println("Max number in array: " + arrayCopy[0]);
        System.out.print("Min number in array: " + arrayCopy[arrayCopy.length-1]);

        System.out.print("\nSorted array by increased method : ");
        DisplayArray(arrayCopy);


    }

    private int[] MySortArrayDoing (int ...array) {
        //  Сортировки массива слева направо, по убыванию
        //  и возврат отсортированного массива в вызывающий метод

        boolean trigger = true;
        int n;

        int[] arraySort = new int[array.length];              //  в новый массив arraySort будет записываться
        arraySort = Arrays.copyOf(array, array.length);       //  результат сортировки


        while (trigger) {
            trigger = false;
            for (int i = 0; i < (array.length-1); i++) {
                if (arraySort[i] < arraySort[i + 1]) {
                    n = arraySort[i];
                    arraySort[i] = arraySort[i + 1];
                    arraySort[i + 1] = n;
                    trigger = true;
                }

            }

        }

        return arraySort;
    }



    public void PrintMaxMinNumbers (int ...array) {
        //  Вывод максимального и минимального значения повторений чисел в массиве

        int[] aMaxMinValues = new int[2];       //  aMaxMinValues[0]  =  максимальное значение
                                                //  aMaxMinValues[1]  =  минимальное значение

        aMaxMinValues = Arrays.copyOf(SearchMaxMinNumbers(array), array.length);

        System.out.println("\nMax repeatings : " + aMaxMinValues[0]);
        System.out.println("Min repeatings : " + aMaxMinValues[1]);

    }


    private int[] SearchMaxMinNumbers (int ...array) {
        //  Поиск максимального и минимального значения повторений чисел в массиве
        //  и возврат результата в виде массива из 2-х чисел

        int[] aMaxMinValues = new int[2];       //  aMaxMinValues[0]  =  максимальное значение
                                                //  aMaxMinValues[1]  =  минимальное значение

        int[] arrayCopy = new int[array.length];
        arrayCopy = Arrays.copyOf(array, array.length);


        //  Создать двухмерный массив - размер в длину == array.length
        //  В первом измерении хранится число, а во втором измерении - сколько раз оно повторяется
        //  пересоздать массив, на этот раз такого размера, сколько есть повторяющихся чисел
        //  для этого нужна переменная counter == (сколько есть повторяющихся чисел)
        //  Если эта переменная равна нулю (counter == 0) тогда выход из метода,
        //  в таком случае вернется пустой массив aMaxMinValues, все ячейки которого будут равны == 0

        int[][] arrayResult = new int[2][(array.length)*2];

        boolean trigger;
        int counter = 0;        //  хранит для числа номер ячейки в arrayResult
        int counterNumber;      //  Число повторений

        for (int k = 0; k < (arrayCopy.length - 1); k++) {         //  Внешний цикл, по количеству элементов в массиве
            counterNumber = 1;
            trigger = true;
            for (int i = 0; i < (arrayCopy.length - 1); i++) {      //  Внутренний цикл, сравнение каждого элемента
                                                                    //  со всеми остальными на совпадение
                if (k == i) continue;

                if (arrayCopy[k] == arrayCopy[i]) {

                    if (trigger) {
                        arrayResult[0][counter] = arrayCopy[i];    //  Записывается число, которое имеет повторения.
                        counter++;                                 //  counter хранит номер ячейки в arrayResult
                        trigger = false;
                    }
                    counterNumber++;
                    arrayResult[1][counter] = counterNumber;      //  Записывается сколько раз встретилось это число


                }

            }


        }

        System.out.println("\n  My new array  :  \n\n" + Arrays.deepToString(arrayResult));

        return aMaxMinValues;

    }


    public int SearchNumber (int number, int ...array) {
        int count = 0;
        int i = 0;

        do
        {

            if (array[i] == number) count++;
            i++;
        }
        while (i < (array.length));

        return count;
    }


    public void SortArray (int ...array) {
        //  стандартный метод сортировки масива (слева направо по возрастанию)

        int[] arrayStandartSorting = new int[array.length];
        arrayStandartSorting = Arrays.copyOf(array, array.length);

        Arrays.sort(arrayStandartSorting);
        System.out.println("\nSorted array by standart method :  " + Arrays.toString(arrayStandartSorting));

    }


    public void DisplayArray (int ...array) {

        int i = 0;

        do
        {

            System.out.print(array[i] + " ");
            i++;
        }
        while (i < (array.length));

    }




}
