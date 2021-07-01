package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
переменную n. Если пользователь ввёл не подходящее число, то программа
должна выдать соответствующее сообщение. Создать массив из n случайных
целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
только из чётных элементов первого массива, если они там есть, и вывести его
на экран.
	 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;
        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            }
        }
        int[] arr = new int[n];
        int a = 0;

        for (int i = 0; i < n; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(n);
            if (arr[i] % 2 == 0) {
                a++;
            }
        }

        System.out.print(Arrays.toString(arr));
        int j = 0;
        int[] arr2 = new int[a];
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}

