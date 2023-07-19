package Lessons;


// Простой перебор - O(n)

public class Find {
    public static void main(String[] args) {
        int array[] = new int[]{
            6, 9, 1, 8, 7, 0, 3, 5 ,9, 4};  

        System.out.println(find(array, 5));  // 7 индекс
    }

    public static int find(int[] array, int value){  // создаем функцию которая будет искать в массиве value\
        for(int i = 0; i < array.length; i++){        // перебор
            if(array[i] == value){                   // сравнение
                return i;
            }
        }    
        return -1;    

    } 
}
