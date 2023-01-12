package Seminare6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // createSet();
        // findUniqueElement(createRandomArray());
        // createCatSet();
    }

    /**
     * 1. Создайте HashSet, заполните его следующими элементами: {Stuart, Alex, Johnny, Igor, Bel}.
     * Распечатайте содержимое данного множества.
     * 2. Создайте LinkedHashSet, заполните его следующими элементами: {Stuart, Alex, Johnny, Igor, Bel}.
     * Распечатайте содержимое данного множества.
     * 3. Создайте TreeSet, заполните его следующими элементами: {Stuart, Alex, Johnny, Igor, Bel}.
     * Распечатайте содержимое данного множества.
     */
    private static void createSet() {
        Set hashSet = new HashSet();
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();

        hashSet.add("Stuart");
        hashSet.add("Alex");
        hashSet.add("Johnny");
        hashSet.add("Igor");
        hashSet.add("Bel");
        System.out.println(hashSet);

        linkedHashSet.add("Stuart");
        linkedHashSet.add("Alex");
        linkedHashSet.add("Johnny");
        linkedHashSet.add("Igor");
        linkedHashSet.add("Bel");
        System.out.println(linkedHashSet);

        treeSet.add("Stuart");
        treeSet.add("Alex");
        treeSet.add("Johnny");
        treeSet.add("Igor");
        treeSet.add("Bel");
        System.out.println(treeSet);
    }



    /**
     * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
     * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
     * уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
     * Для вычисления процента используйте формулу:
     * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
     */
    private static int[] createRandomArray() {
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() *24) + 0);
        }
        return array;
    }

    private static void findUniqueElement(int[] array) {
        double result = 0;

        Set<Integer> arrayUnique = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            arrayUnique.add(array[i]);
        }

        result = arrayUnique.size() * 100 / array.length;
        System.out.println(result + "%");
    }



    /**
     * Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
     * а) информационной системой ветеринарной клиники - name, age, passportVaccinations
     * б) архивом выставки котов - name, age, color, breed, numberOfParticipants, numberOfExhibitions
     * в) информационной системой Театра кошек Ю. Д. Куклачёва- name, age, tricks, goodies
     */

     /**
     * 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
     * 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
     * 3. Создайте метод
     * **public boolean**
     * equals(Object o)
     * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
     * 4. Создайте метод
     * **public int hashCode()**
     * который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
     * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
     */
    private static void createCatSet() {
        Cat cat = new Cat("Barsik", 2, "black",  2236);
        Cat cat2 = new Cat("Myrka", 4, "white",4456);
        Cat cat3 = new Cat("Gav", 1, "red",7489);
        Cat cat4 = new Cat("Gav", 1, "red",7489);

        Set<Object> setCat = new HashSet<>();
        setCat.add(cat);
        setCat.add(cat2);
        setCat.add(cat3);
        setCat.add(cat4);

        System.out.println(setCat);
    }
}
