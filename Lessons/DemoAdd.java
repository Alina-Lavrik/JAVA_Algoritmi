

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoAdd {
    public static void main(String[] args) {
        //List<Integer> availableDivider = findAvailableDivider(16);  // для первой задачи
        //List<Integer> availableDivider = findSimpleNumbers(10);  // для второй задачи
        // for (Integer integer: availableDivider){
        //     System.out.println(integer);
        //}
        
        AtomicInteger counter = new AtomicInteger(0);   // создаем счетчик для задачи с fib
        int fib = fib(10, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());

        fib = fib(11, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());

        fib = fib(12, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());

        fib = fib(13, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
    }


//1. Создаем функцию для поиска допустимого делителя - findAvailableDivider
// Линейная сложность

    public static List<Integer> findAvailableDivider(int number){     // number переменная по которой мы должны будем найти все доступные делители
        int counter = 0;
        List<Integer> result = new ArrayList<>();                      // лист result -> куда мы будем возвращать результат
        for (int i = 1; i <= number; i++){                            // делим наше число на все числа меньше него, от 1 до самого числа
            counter++;
            if (number % i == 0){                          // мы пробуем делить наше число на теущий элемент - число i и если остаток от деления равен 0, значит i явл допустимым делителем 
                result.add(i);                            // запишем i в результат
            }                                   
        }
        System.out.println("Counter: " + counter);
        return result;                                  // возвращаем полученный результат
    }

/* 2. Напишем алгоритм поиска допустимых делителей для простого числа на опред отрезке от 0 до N
Простое число делится на 1 и на само себя
Квадратичная сложность */

    public static List<Integer> findSimpleNumbers(int max){
        int counter = 0;
        List<Integer> result = new ArrayList<>();       // запишем результат
        for (int i = 1; i <= max; i++){                 // перебирам все числа от 1 до max и проверяем все числа на наличие допустимых делилителей
            boolean simple = true;                      // переменная simple отвечает за проверку является ли i простым числом и в случае нахождения допустимого делителя мы будем менять флаг
            for (int j = 2; j < i; j++){   
                counter++;             
                if (i % j == 0) {                       // беря отпределенное чило i ищем допустимый делитель
                    simple = false;
                    break;  // как только нашли число simple = false останавливаем и кол-во операций будет сокращено
                }
            }
            if (simple) {                               // если simple не поменялся мы заносим его в result
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }

/* 3. Функция вычисления чисел Фибоначчи
Последовательность чисел Фибоначчи начинается с чисел 0 и 1, а все последующие элементы вычисляется путем сложения двух предыдущих. 
0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144 и т.д. */

 
    public static int fib(int position, AtomicInteger counter){    // возвращает интовое значение и принимает номер позиции с которой мы хотим работать
        counter.incrementAndGet();  // в рекурсии counter делается через инкремент
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }
        return fib(position -1, counter) + fib(position -2, counter); // складываем два предыдущих числа нашей последовательности

    }

}

