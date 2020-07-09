package Serj;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        /* Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
        угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем
        загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
        1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
        System.out.println("Task 1.");
        guessNumber(9, 3);

    }

    public static void guessNumber(int number, int chance) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(number);
        System.out.println("Предлагаем вам сыграть в игру с числом от 0 до " + number + ". Есть " + chance + " попытки, чтобы угадать число.");

        for (int i = 0; i < chance; i++) {
            System.out.println("Попытка " + (i + 1));
            int a = sc.nextInt();
            if (a == x) {
                System.out.println("Поздравляем,вы угадали число.");
                break;
            } else if (x < a) {
                System.out.println("Загаданное число меньше.");
            } else if (x > a) {
                System.out.println("Загаданное число больше.");
            }
        }
        System.out.println("Игра окончена, правельное число было " + x + " Сыграем еще раз? 1 - да. 0 - нет.");
        int a = sc.nextInt();
        if (a == 1) {
            guessNumber(9, 3);
        } else if (a == 0) {
            System.out.println("Спасибо за игру, всего доброго!");
        }
    }
}

