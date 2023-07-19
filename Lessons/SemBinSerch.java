package Lessons;


// Бинарный поиск - работает по принципу деления пополам

public class SemBinSerch {
    public static void main(String[] args) {
        int[] array = new int[10];
        SemSortChoice.randomizeArray(array);
        SemQuickSort.quickSort(array);
        SemSortChoice.print(array);

        System.out.println(binSearch(array, 5));   // сработает только на отсортированном массиве
        
    }


    public static int binSearch(int[] array, int key){
       return binSearch(array, key, 0, array.length -1);
    }

    public static int binSearch(int[] array, int key, int left, int right){
        if (left > right){
            return -1;   // вышли за границы

        }
        int midpoint = (left + right) / 2;
        if (array[midpoint] < key){
            return binSearch(array, key, midpoint + 1, right);  // берем правую часть
        }
        else if (array[midpoint] > key){
            return binSearch(array, key, left, midpoint - 1); // берем левую часть
        }
        else 
            return midpoint;

    }
}
    

