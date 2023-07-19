package Lessons;

import java.util.Random;

/*  Сортировка вставками 
Начинаем с первого индекса и смотрим - левый элемент меньше? Если да, меняем местами элементы - 
элемент под первым индексом ставим на 0 индекс и с 0 индеса элемент на первый
Далее смотрим на элемент под 2 индексом - левый элемент меньше? нет
Далее смотрим на элемент под 3 индексом - левый элемент меньше? Да, меняем местами
Далее сравниваем передвинутый элемент на идекс два с элементом под индексом 1 - меняем местами
*/

public class SemInsertSort {
    public static void main(String[] args) {
        int[] array = new int[10];           // создаем массив на 10 элементов
        randomizeArray(array);
        System.out.println("Рандомый массив: ");
        print(array);
        insertionSort(array);
        System.out.println("Отсортированный вставками массив: ");
        print(array);
    }
    

    public static void insertionSort(int[] array){
        for (int right = 0; right < array.length; right++){   // проходимся по всем элементам, кроме 1, он нам не важен и идем до конца
            int value  = array[right];    // запоминаем наше значение, на которм стоим, чтобы оне не потерялось ткт мы просто сдвтигаем все эелементы
            int i = right -1;   // элемент левее того с которым мы работаем
            while( i >= 0) {     // идем до самого левого края
                if(value < array[i])
                    array[i + 1] = array[i];
                else
                    break;       // если найдется значение меньше нашего value мы останавливаем цикл
                i--;            // i пока идем влево у нас уменьшается

            }
            array[i + 1] = value; // берем следующий элемент и продолжаем проверку
        }
    }


    public static void randomizeArray(int[] array){    // метод для заполнения массива
        for (int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(100);
        }
    }
    
    public static void print(int[] array){    // метод для распечатывания массива
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
