package com.github.umarshabazov.acmp;

import java.util.*;
import java.util.Map.Entry;

public class Collections {
    public static void main(String[] args) {

//        list1();
//        set1();
//        queue1();
     map1();
    }

    private static void queue1() {

        Queue <String> names = new LinkedList<>();

        names.add("Tony");
        names.add("Silvio");
        names.add("Polly");
        names.add("Christofer");
        names.add("Pussy");
        System.out.println(names);

        System.out.println(names.poll());
        System.out.println(names);
        System.out.println(names.poll());
        names.poll();
        System.out.println(names);


        names.poll();
        System.out.println(names);

        names.add("AnthonyJunior");
        System.out.println(names);

        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            System.out.println(name);

        }
    }

    private static void set1() {

        Set<String> names = new HashSet<>();
        names.add("Vova");
        names.add("Stas");
        names.add("John");
        names.add("Sasha");
        names.add("Anastasiia");
        names.add("NataliaBabulya");

        System.out.println(names);

        names.add("Vova");
        System.out.println(names);


        System.out.println(names);

        System.out.println(names.contains("Semen"));
        System.out.println(names.contains("Sasha"));

        names.remove("Anastasiia");

        System.out.println(names);


    }

    private static void list1() {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(184);
        System.out.println(numbers);

        System.out.println(numbers.contains(4));

        numbers.remove(1);
        System.out.println(numbers);

        numbers.set(1, 15);
        System.out.println(numbers);

        System.out.println(numbers.get(2));

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number%2 ==0) {
                evenNumbers.add(number);
            }

        }
        System.out.println(evenNumbers);

    }

    public static void map1() {

        HashMap <String, Integer> names2Age = new HashMap<>();

        names2Age.put("Ivan",17);
        names2Age.put("Alisa", 25);
        names2Age.put("John",21);
        names2Age.put("Aladdin",1300);


        System.out.println(names2Age);

        System.out.println(names2Age.containsKey("Ivan"));
        System.out.println(names2Age.containsKey("Boris"));

        names2Age.remove("Ivan");
        System.out.println(names2Age.containsKey("Ivan"));

        if (!names2Age.containsKey("Masha")) {
            names2Age.put("Masha", 19);
        }

        System.out.println(names2Age);

        names2Age.put("Aladdin", names2Age.get("Aladdin") + 1);
        System.out.println(names2Age);


        System.out.println(names2Age.keySet());

        System.out.println(names2Age.entrySet());


        Set<Entry<String, Integer>> entries = names2Age.entrySet();
        System.out.println(entries);

        for (Entry<String, Integer> entry : entries) {
            if (entry.getKey().startsWith("A")) {
                System.out.println(entry);
            }
        }

    }
}

