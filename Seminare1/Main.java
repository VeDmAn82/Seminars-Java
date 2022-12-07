package Seminare1;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Задача2
        // int[] arr = {1,1,0,1,1,1};
        // System.out.println(countNumberOne(arr));

        // Задача3
        // int[] arr = { 3, 2, 2, 3 };
        // int value = arr.length;
        // pushThreeToEnd(arr, value);
        // System.out.println("После перемещения 3-ки в конец: ");
        // for (int i = 0; i < value; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // Задача4
        // longestCommonPrefix();

        // Задача5
        // stringRevers();

        // Задача6
        // getTimeHello();


    }

    /**
     * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
     * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
     */
    // Задача1
    public static void printEnterName() {
        System.out.print("Введите имя: ");
        Scanner enterName = new Scanner(System.in);
        String name = enterName.nextLine();
        System.out.println("Привет: " + name);
    }


    /**
     * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
     * количество подряд идущих 1.
     */
    // Задача2
    public static int countNumberOne(int[] arr) {
        int count = 0;
        int max = 0;

        for (int elem : arr) {
            if (elem == 0) {
                count = 0;
            } else {
                count++;
            }
            if (max <= count) {
                max = count;
            }
        }
        return max;
    }


    /**
     * Дан массив nums = [3,2,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
     * конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть
     * отличны от заданного
     * а остальные - равны ему.
     */
    // Задача3
    public static void pushThreeToEnd(int[] arr, int length) {
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != 3) {
                arr[count++] = arr[i];
            }
        }
        while (count < length) {
            arr[count++] = 3;
        }
    }


    /**
     * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
     * Если общего префикса нет, вернуть пустую строку "".
     */
    // Задача4
    public static void longestCommonPrefix() {
        String[] str = {"disappear", "disarm", "disconnect "};
        if (str.length == 0) {
            System.out.println("Нет общего префикса!");
        }
        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println(prefix);
    }


     /**
     * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
     */
    // Задача5
    public static void stringRevers() {
        String str = "Добро пожаловать на курс по Java";

        String result = new StringBuilder(str).reverse().toString();

        System.out.println(result);
    }

    public static void stringRevers2() {
        String[] str = "Добро пожаловать на курс по Java".split("\\s");
        String rev = "";
        for (int i = str.length - 1; i >= 0; i--) {
            rev = rev + str[i] + " ";
        }
        System.out.println(rev);
    }


    /**
     * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
     * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
     * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
     * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
     * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
     * </aside>
     */
    // Задача6
    public static void getTimeHello() {
        Date today = new Date();
        double curHr = today.getHours();

        System.out.print("Введите имя: ");
        Scanner enterName = new Scanner(System.in);
        String name = enterName.nextLine();

        if (curHr > 5 && curHr < 11.59) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (curHr > 12 && curHr < 17.59) {
            System.out.println("Добрый день, " + name + "!");
        } else if (curHr > 18 && curHr < 22.59){
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
