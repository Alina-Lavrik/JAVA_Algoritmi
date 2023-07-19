package Lessons;

public class TimeOfSort {


    public static void main(String[] args) {
        int[] array = new int[50];  
        int[] array2 = new int[array.length];
        SemSortChoice.randomizeArray(array);      // вызов рандомного метода из сортировки выбором
        System.arraycopy(array, 0, array2, 0, array.length);
        SemSortChoice.print(array);
        SemSortChoice.print(array2);

        long start1 = System.nanoTime();
        SemQuickSort.quickSort(array);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        SemInsertSort.insertionSort(array2);
        long end2 = System.nanoTime();

        
        System.out.println("Время быстрой сортировки: " + (end1 - start1));
        
        System.out.println("Время сортировки вставками: " + (end2 - start2));
    }
    
}
