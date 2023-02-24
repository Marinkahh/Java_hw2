package Seminar2.hw;

import java.util.Scanner;

/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        System.out.println("Число:");
        int num = scanner.nextInt();
        boolean b = true;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if(num2 < num){
                b=false;
                break;
            }
        }
        if (b) System.out.println("Последовательность чисел является возрастающей!");
        else  System.out.println("Последовательность чисел не является возрастающей!");
        scanner.close();

    }
}
