import java.util.Arrays;

public class ArrayLogic {

    public void MySortArray (int ...array) {
        //  Поиск максимального и минимального числа в массиве
        //  методом собственной сортировки массива (слева направо, по убыванию)

        int[] arrayCopy = new int[array.length];    // в arrayCopy будет храниться уже отсортированный массив

        arrayCopy = Arrays.copyOf(MySortArrayDoing(array), array.length);

        //  Нужно только для фазы тестирования.  ПОТОМ УБРАТЬ!
        System.out.println("\nSorted by my method : ");
        DisplayArray(arrayCopy);
        System.out.println();
        //

        System.out.print("\nMax number in array: " + arrayCopy[0]);
        System.out.println("\nMin number in array: " + arrayCopy[arrayCopy.length-1]);

    }

    private int[] MySortArrayDoing (int ...array) {
        //  Сортировки массива слева направо, по убыванию
        //  и возврат отсортированного массива в вызывающий метод

        int[] arrayCopy = new int[array.length];  // именно в новый массив arrayCopy будет записываться результат
        arrayCopy = Arrays.copyOf(array, array.length);  // это нужно только для фазы тестирования, ПОТОМ УДАЛИТЬ!




        return arrayCopy;
    }



    public int[] SearchMaxNumber (int ...array) {
        //  Поиск максимального\минимального значения повторений чисел в массиве

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
        System.out.println();
        int i = 0;

        do
        {

            System.out.print(array[i] + " ");
            i++;
        }
        while (i < (array.length));

    }




}
