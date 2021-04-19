package Java2.HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PhoneDirectory {

    //Задание 2

    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Иванов", "4379");
        phoneDirectory.add("Петров", "4557");
        phoneDirectory.add("Сидоров", "4871");
        phoneDirectory.add("Иванов", "4963");
        phoneDirectory.add("Васильев", "4125");
        phoneDirectory.add("Балкин", "4751");
        phoneDirectory.add("Борисов", "4632");
        phoneDirectory.add("Игнатьев", "4812");
        phoneDirectory.add("Петров", "4632");

        phoneDirectory.get("Иванов");
        phoneDirectory.get("Васильев");

    }




    HashMap<Integer, String> dic1 = new HashMap<>();
    HashMap<Integer, String> dic2 = new HashMap<>();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();

    public PhoneDirectory() {
        dic1.put(null, "null");
        dic2.put(null, "null");
        }

    public void add(String a, String b){
        int size = dic1.size();
        dic1.put(size, a);
        dic2.put(size, b);

    }
    public void get(String a){
        for (Map.Entry<Integer, String> i : dic1.entrySet()) {
            if (i.getValue().equals(a)) {
                list1.add(i.getKey());
            }
        }
        for (Integer j : list1) {
            list2.add(dic2.get(j));
        }
        System.out.println(list2);
        list1.clear();
        list2.clear();
    }
}
