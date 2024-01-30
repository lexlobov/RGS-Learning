package ru.sberhealth.rgs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("John");
        strings.add("Michael");
        strings.add("John");
        strings.add("Sarah");

        System.out.println(strings);
        strings.remove("John");
        System.out.println(strings);
        strings.set(1, "Sam");
        System.out.println(strings);


        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

        for (String string: strings) {
            System.out.println(string);
        }

        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Sarah");
        names.add("Michael");
        names.add("George");

        System.out.println(names.iterator().next());
        System.out.println(names.iterator().next());

        for (String name: names) {
            System.out.println(name);
        }

        Map<Integer, String> users = new HashMap<>();
        users.put(1, "John");
        System.out.println(users.get(1));

        System.out.println("John, если удаление успешное" + users.remove(1));

        users.put(2, "Sarah");
        System.out.println("true, если удаление успешное " + users.remove(2, "Sarah"));

        users.put(3, "James");
        users.replace(3, "Scott");
        System.out.println("Replaced user " + users.get(3));

        users.put(4, "Kyle");
        users.put(5, "Alex");
        users.put(6, "Christina");

        for (Map.Entry<Integer, String> user: users.entrySet()) {
            System.out.println("Вывод через foreach " + user);
        }

        for (String value: users.values()){
            System.out.println("Вывод только значения: " + value);
        }

        for (Integer key: users.keySet()){
            System.out.println("Вывод только ключа: " + key);
        }
    }
}
