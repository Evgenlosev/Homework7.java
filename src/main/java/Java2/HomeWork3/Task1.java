package Java2.HomeWork3;

import java.sql.Array;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String [] arr = {"Белый", "Черный", "Зеленый", "Фиолетовый", "Белый", "Желтый", "Черный", "Белый", "Красный",
                "Белый", "Желтый", "Коричневый", "Красный", "Зеленый", "Красный"};
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        for (String a : arr) {
            set.add(a);
        }
        for (String s : set) {
            int count = 0;
            for (String a : arr) {
                if (a.equals(s)){
                    count++;
                }
            }
            map.put(s, count);
        }
        System.out.println(set);
        System.out.println(map);
    }
}
