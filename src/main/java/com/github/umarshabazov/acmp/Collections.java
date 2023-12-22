package com.github.umarshabazov.acmp;

import java.util.*;

public class Collections {
    public static void main(String[] args) {

//        list1();
//        set1();
        queue1();
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
}

