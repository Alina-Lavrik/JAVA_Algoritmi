package Lessons;

// Сортировки массивов

public class SortBubble {

    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5};  // заводим массив на 11 чисел

        bubbleSort(array); // вызываем нашу функцию

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    // Сортировка пузырьком - сложность поиска O(n^2)

    public static void bubbleSort(int[] array){
    // мы делаем обход массива и сравниваем два крайних элемента 
        boolean finish;
        do {
            finish = true;   // в начале каждого прохода мы говорим что finish = true
            for(int i = 0; i < array.length - 1; i++){  // сравнение 2-х последних чисел должно происходить когда наш i равен предпоследнему числу
            // иначе будет переполнение массива, поэтому длинна массива -1

                if (array[i] > array[i+1]){ // если верно, меняем эти значения местами
                    int temp = array[i];  // создаем переменную и туда кладем значение массива
                    array[i] = array[i + 1]; // в значение массива записываем соседнее значение
                    array[i + 1] = temp; // возвращаем ранее записанное значение в temp
                    finish = false;  // как только была совершена операция обмена, заканчивать нельзя, поэтому ставим false
                }
            }
        } while (!finish); // делать пока finish не изменится
    }
    
}
