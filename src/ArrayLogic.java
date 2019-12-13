import java.util.Arrays;

public class ArrayLogic {

    public void MySortArray (int ...array) {
        //  Вывод максимального и минимального числа в массиве
        //  методом собственной сортировки массива (слева направо, по убыванию)

        int[] arrayCopy = new int[array.length];    // в arrayCopy будет храниться уже отсортированный массив

        arrayCopy = Arrays.copyOf(MySortArrayDoing(array), array.length);

        //  Теперь в массиве arrayCopy лежит отсортированный по возрастанию массив

        System.out.println("Max number in array: " + arrayCopy[0]);
        System.out.println("Min number in array: " + arrayCopy[arrayCopy.length-1]);

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



    public int[] SearchMaxNumber (int ...array) {
        //  Поиск максимального и минимального значения повторений чисел в массиве

        int[] arrayMaxMinValues = new int[2];   //  arrayMaxMinValues[0]  =  максимальное значение
                                                //  arrayMaxMinValues[1]  =  минимальное значение



        return arrayMaxMinValues;

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
