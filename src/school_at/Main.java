package school_at;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {5, 7, 8, 2, 6};
        int[] arr2 = {5, 9, 6, 2, 7};

        // преобразуем значения массива в строку
        System.out.println(Arrays.toString(arr2));
        //сортировка массива
        Arrays.sort(arr2);
        //Сохраняем массив в лист
        System.out.println(Arrays.asList(arr1));
        //копируем значения с 2 по 5 из заданного массива в новый
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr1, 2, 5)));
        //копируем значения из исходного массива в новый с указанием длины нового массива
        System.out.println(Arrays.toString(Arrays.copyOf(arr2, 9)));
        // бинарный номера элемента массива по значению, чтобы получить номер элемента массив должен быть отсортирован
        Arrays.sort(arr2);
        System.out.println(Arrays.binarySearch(arr2, 7));
        //лексикографическое сравнение двух массивов
        System.out.println(Arrays.compare(arr1, arr2));
        //лексикографическое сравнение двух массивов, каждое значение для сравнения берется по модулю
        System.out.println(Arrays.compareUnsigned(arr1, arr2));
        // сравнение двух массивов на равенство
        System.out.println(Arrays.equals(arr1, arr2));
        // цифровоепрелставение массива
        System.out.println(Arrays.hashCode(arr1));
        // сравнение массивов с выводом индекса первого несовпавшего элемента
        System.out.println(Arrays.mismatch(arr1, arr2));
        //этот метод возвращает Spliterator охватывающий се элементы массива
        System.out.println(Arrays.spliterator(arr1));
        //этот метод возвращает последовательный поток данных с указанным массивом в качестве источника.
        System.out.println(Arrays.stream(arr2));
        //этот метод выполняет функцию parallelPrefix для заданного диапазона массива с указанным функциональным оператором.
        IntBinaryOperator op = Integer::sum;
        Arrays.parallelPrefix(arr1, op);
        Arrays.stream(arr1).forEach(e -> System.out.print(e + " "));
        // Заполняет массив указанным значением
        Arrays.fill(arr2, 55);
        System.out.println("\n" + Arrays.toString(arr2));
    }
}
