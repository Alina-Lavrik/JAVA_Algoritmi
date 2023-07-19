package Lessons;

/*Бинарный поиск - тип поискового алгоритма, который последовательно
делит пополам заранее отсортированный массив данных, чтобы обнаружить
нужный элемент. 
Другие его названия — двоичный поиск, метод половинного
деления, дихотомия. 
Принцип работы алгоритма бинарного поиска. Основная
последовательность действий алгоритма выглядит так: Сортируем массив
данных. Делим его пополам и находим середину.
Сложность - O(log n)
 */


public class Binary {
    public static void main(String[] args) {
        int array[] = new int[]{
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        System.out.println(binarySearch(array, 1));
    }

    // чтобы сократить вывод
    public static int binarySearch(int[] array, int value){
        return binarySearch(array, value, 0, array.length -1);
    }

    // Функция бинарного поиска 
    // Создадим при помощи рекурсии

    public static int binarySearch(int[] array, int value, int min, int max){
        int midpoint;

        if (max < min){
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;  // поиск середины
        }
            // нужно определить какую часть массива левую или правую относительно midpoint будем обрабатывать
        if (array[midpoint] < value){  // запускаем бинарный поиск для левой части массива
            return binarySearch(array, value, midpoint + 1, max);
        } else {
            if (array[midpoint] > value){  // запускаем бинарный поиск для правой части массива
            return binarySearch(array, value, min, midpoint -1);
        } else {
            return midpoint;
        }
    }
    
    }
}