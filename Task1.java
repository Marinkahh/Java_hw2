package Seminar2.hw;

import java.util.Scanner;

/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int sum = 0;
        boolean b = true;
        for (int P = 2; P <= input; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b)
            {
                sum= sum+P;
                System.out.println(P);
            }
            else b = true;
        }
        System.out.println(sum);
    }
}

