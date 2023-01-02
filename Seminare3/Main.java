package Seminare3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // equals();
        // arrayList();
        // listOfPlanets();
        // instanceOfString();
    }
        
    /**
     * Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
     * String s1 = "hello";
     * String s2 = "hello";
     * String s3 = s1;
     * String s4 = "h" + "e" + "l" + "l" + "o";
     * String s5 = new String("hello");
     * String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
     */
    private static void equals() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s5));
        System.out.println(s1 == s5);
    }
     
    
    /**
     * Заполнить список десятью случайными числами.
     * Отсортировать список методом sort() и вывести его на экран.
     */
    private static void arrayList() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int val = random.nextInt(-10, 10);
            array.add(val);
        }

        Collections.sort(array);

        System.out.println(Arrays.asList(array));
    }
       
    
    /**
     * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
     * Вывести название каждой планеты и количество его повторений в списке.
     */
    private static void listOfPlanets() {
        int n = 1;
        List<String> listPlanets = new ArrayList<>();
        listPlanets.add("Mercury");
        listPlanets.add("Venus");
        listPlanets.add("Venus");
        listPlanets.add("Earth");
        listPlanets.add("Mars");
        listPlanets.add("Jupiter");
        listPlanets.add("Jupiter");
        listPlanets.add("Jupiter");
        listPlanets.add("Saturn");
        listPlanets.add("Uranus");
        listPlanets.add("Uranus");

        // Iterator<String> list = listPlanets.iterator();

        // String old = list.next();

        // while (list.hasNext()) {
        //     String next = list.next();
        //     if (old.equals(next)) {
        //         list.remove();
        //     }
        //     old = next;
        // }
        // System.out.println(listPlanets);
        
        for (int i = 0; i < listPlanets.size(); i++) {
            if(i != listPlanets.size() - 1) {
                if (Objects.equals(listPlanets.get(i), listPlanets.get(i + 1))) {
                    ++n;
                } else {
                    System.out.println(listPlanets.get(i) + " - " + n);
                    n = 1;
                }
            } else {
                System.out.println(listPlanets.get(i) + " - " + n);
            }
        }
    }
     
    
    /**
     * Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
     * Пройти по списку, найти и удалить целые числа.
     */
    private static void instanceOfString() {
        List array = new ArrayList<String>();
        array.add(1);
        array.add("Java");
        array.add(409);
        array.add(4);
        array.add("Home");
        array.add("Work!");

        for (int i = 0; i < array.size();) {
            if (array.get(i) instanceof Integer) {
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(array);
    }   
}
