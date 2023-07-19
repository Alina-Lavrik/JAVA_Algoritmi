
package Lessons;

import java.util.Random;

/* Семинар 2
Сортировка выбором - мы смотрим на один элемент массива и сравниваем его с остальными и когда находим меняем с текущим местами
Мы каждый раз проходимся не по всему массиву в только по его части
Сначала все элементы без первого, потом все элементы без первых двух, потом без первых трех и тд
*/

public class SemSortChoice {

    public static void main(String[] args) {
        int[] array = new int[10];           // создаем массив на 10 элементов
        randomizeArray(array);
        System.out.println("Рандомый массив: ");
        print(array);
        selectionSort(array);
        System.out.println("Отсортированный выбором массив: ");
        print(array);
    }

   // Метод сортировки выбом

    /**
     * @param array
     */
    public static void selectionSort(int[] array){
        for (int left = 0; left < array.length - 1; left++) {    // left крайний левый индекс, который проверяем
            int minIndex = left;     // сохраняем minIndex - индекс минимального элемента!
            for (int i = left; i < array.length; i++)   // каждый раз начинаем не с 1-го элемента массива а с того элемента на котором стоим
                if (array[i] < array[minIndex])  // ищем наименьшее число
                    minIndex = i;
            if (left != minIndex) {   // усли left не равен индексу с минимальным элементом, тогда меняем местами
                int temp = array[left];
                array[left] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }


    public static void randomizeArray(int[] array){    // метод для заполнения массива
        for (int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(10);
        }
    }
    
    public static void print(int[] array){    // метод для распечатывания массива
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}