import java.util.Arrays;

public class ArrayLogic {

    public int[] MySortArray (int ...array) {
        //  Поиск максимального\минимального числа в массиве
        //  методом собственной сортировки массива (слева направо, по убыванию)

        int[] array2 = new int[array.length];  // именно в новый массив array2 будет записываться результат
        array2 = Arrays.copyOf(array, array.length);  // это нужно только для фазы тестирования, ПОТОМ УДАЛИТЬ!




        return array2;
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
