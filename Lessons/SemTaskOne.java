package Lessons;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

/* Задание 1 (тайминг 5 минут)
Необходимо написать алгоритм, считающий сумму всех чисел
от 1 до N. Согласно свойствам линейной сложности,
количество итераций цикла будет линейно изменяться
относительно изменения размера N.*/

public class SemTaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = 1;
        int sum = 0;
        while (d <= N){
            sum += d;
            d++;
        }
        System.out.println(sum);
        sc.close();
    }
}