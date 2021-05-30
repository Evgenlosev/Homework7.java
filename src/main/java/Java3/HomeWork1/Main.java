package Java3.HomeWork1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Integer[] inum = new Integer[] {1, 2, 3, 4, 5};
        String[] istr = new String[] {"Один", "Два", "Три", "Четыре", "Пять"};
        System.out.println("Default arrays:");
        System.out.println(Arrays.toString(inum));
        System.out.println(Arrays.toString(istr));
        replace(inum, 0,1);
        replace(istr, 0, 1);
        System.out.println("Arrays after replacement:");
        System.out.println(Arrays.toString(inum));
        System.out.println(Arrays.toString(istr));

        //Задание 2
        System.out.println();
        System.out.println("ArrayLists after transformation from Arrays:");
        System.out.println(arrayToArraylist(inum));
        System.out.println(arrayToArraylist(istr));

        //Задание 3
        System.out.println();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.addFruit(new Apple());
        box1.addFruit(new Apple());
        box1.addFruit(new Apple());

        box2.addFruit(new Orange());
        box2.addFruit(new Orange());

        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());

        System.out.println("Вес коробки 1 = " + box1.getWeight());
        System.out.println("Вес коробки 2 = " + box2.getWeight());
        System.out.println("Вес коробки 3 = " + box3.getWeight());

        System.out.println("Вес короюок 1 и 2 равен - " + box1.compare(box2));
        System.out.println("Вес короюок 1 и 3 равен - " + box1.compare(box3));

        box2.pour(box3);
        System.out.println("После пересыпания:");
        System.out.println("Вес коробки 2 = " + box2.getWeight());
        System.out.println("Вес коробки 3 = " + box3.getWeight());
    }

    public static <T> void replace (T[] arr, int a, int b){
        T a1 = arr[a];
        arr[a] = arr[b];
        arr[b] = a1;
    }

    public static <T>ArrayList arrayToArraylist (T[] arr) {
        ArrayList <T> arrayList = new ArrayList<>(Arrays.asList(arr));
        return arrayList;
    }
}
