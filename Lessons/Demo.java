

package Lessons;

import java.util.ArrayList;
import java.util.List;

// Алгоритм поиска допустимых делителей 

public class Demo {
    public static void main(String[] args) {
        List<Integer> availableDivider = findAvailableDivider(99);
        for (Integer integer: availableDivider){
            System.out.println(integer);
        }
    }


// Создаем функцию для поиска допустимого делителя - findAvailableDivider

    public static List<Integer> findAvailableDivider(int number){     // number переменная по которой мы должны будем найти все доступные делители
        List<Integer> result = new ArrayList<>();                      // лист result -> куда мы будем возвращать результат
        for (int i = 1; i <= number; i++){                              // делим наше число на все числа меньше него, от 1 до самого числа
            if (number % i == 0){                          // мы пробуем делить наше число на теущий элемент - число i и если остаток от деления равен 0, значит i явл допустимым делителем 
                result.add(i);                            // запишем i в результат
            }                                   
        }
        return result;                                  // возвращаем полученный результат
    }
}