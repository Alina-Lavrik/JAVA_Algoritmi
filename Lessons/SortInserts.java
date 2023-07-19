
package Lessons;

/*  Сортировка вставками -после сравнения двух элементов мы не запоминаем индекс
наименьшего (наибольшего) из элементов, а сразу производим перестановку, 
здесь идет сравнение конкретного идекса со всеми осавшимися элементами
Сложность -  O(n^2)**/


public class SortInserts {
    public static void main(String[] args) {
        int[] array = new int[]{41, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5};  // заводим массив на 11 чисел
    
        insertSort(array); // вызываем нашу функцию
    
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }


    public static void insertSort(int[] array) {
        for(int i = 0; i < array.length -1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
    }
}
