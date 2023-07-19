package Lessons;

//import java.util.Random;


/* Быстрая сортировка - одна из САМЫХ быстрых в программировании на данный момент
мы отпределяем центральный элемент (якорь) или центр элемент +/- 1 путем деления массива на 2 
Перебор массива начинаем с краев с крайнего левого и правого элемента - всегда!
Далее переходи к след элеменам (двигаемся на 1 элемент к центру / якорю) - следующий от крайнего левого и след. от крайнего правого
Главная фишка - все что меньше скидываются налево, все что больше скидываются направо, 
такая сортировка позволяет сортировать 2 части (левую и правую) независимо друг от друга
*/

public class SemQuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];           // создаем массив на 10 элементов
        SemSortChoice.randomizeArray(array);      // вызов рандомного метода из сортировки выбором
        System.out.println("Рандомый массив: ");
        SemSortChoice.print(array);              // вызов метода печати из сортировки выбором
        System.out.println("Быстрая сортировка: ");
        quickSort(array);
        SemSortChoice.print(array);  
}

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);  // для упрощения обозначили края LB = 0 и RB
    }

    public static void quickSort(int[] array, int leftBorder, int rightBorder){   // к массиву добавили границы, которые мы будем сортировать от LB - RB и LB - RB
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftBorder + rightBorder) / 2];   // выбираем середину
        // условие выхода из алгоритма
        while(leftMarker <= rightMarker) {   // когда левый маркр выйдет за правый и наоборт, значит мы ппрошли и проверили все элементы. 
             // мы проверям каждый элемент и ищем тот который будет больше якоря
            while(array[leftMarker] < pivot)   // пока левый элемент меньше pivot мы увеличиваем leftMarker
                leftMarker++;
            // аналогично с правым
            while(array[rightMarker] > pivot)         
                rightMarker--;  
            // после выполнения 2-х циклов мы нашли элементы кот нужно поменять местами
            if(leftMarker <= rightMarker) { 
                if(leftMarker != rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }    
                leftMarker++;  // чтобы не рассматривать одни и теже элементы
                rightMarker--;                 
            }
        }
        // рекурсивно запускаем
        if (leftMarker < rightBorder) {  // если левый элемент не ушел за правый край
            quickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker){
            quickSort(array, leftBorder, rightMarker);
        }
    }
}  

