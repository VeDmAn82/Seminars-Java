package Seminare5.First;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class isomorphic {
    public static void main(String[] args) {
        String X = "paper";
        String Y = "title";

        if (isIsomorphic(X, Y)) {
            System.out.println(X + " and " + Y + " are Isomorphic");
        }
        else {
            System.out.println(X + " and " + Y + " are not Isomorphic");
        }
    }
    public static boolean isIsomorphic(String X, String Y) {
        // базовый вариант
        if (X == null || Y == null) {
            return false;
        }

        // если 'X' и 'Y' имеют разную длину, они не могут быть изоморфны
        if (X.length() != Y.length()) {
            return false;
        }

        // используем карту для хранения сопоставления символов строки 'X' со строкой 'Y'
        Map<Character, Character> map = new HashMap<>();

        // используем set для хранения пула уже сопоставленных символов
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < X.length(); i++)
        {
            char x = X.charAt(i), y = Y.charAt(i);

            // если 'x' был замечен раньше
            if (map.containsKey(x))
            {
                // вернуть false, если первое вхождение `x` сопоставлено с
                // другой символ
                if (map.get(x) != y) {
                    return false;
                }
            }

            // если 'x' виден в первый раз (т.е. он еще не отображен)
            else {
                // вернуть false, если 'y' уже сопоставлен с каким-то другим символом в 'X'
                if (set.contains(y)) {
                    return false;
                }

                // сопоставляем 'y' с 'x' и помечаем его как сопоставленный
                map.put(x, y);
                set.add(y);
            }
        }

        return true;
    }
    
}
