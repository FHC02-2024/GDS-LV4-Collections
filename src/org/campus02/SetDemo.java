package org.campus02;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("max");
        names.add("susi");
        names.add("john");
        names.add("max");

        int size = names.size(); // erwartung: 3
        System.out.println("size = " + size);
        for (String name : names) {
            System.out.println("name = " + name);
            System.out.println("name = " + name.hashCode());
        }

        String max = new String("max");
        System.out.println(max.hashCode());

        names.remove(max);
        boolean containsMax = names.contains(max); // STRG + ALT + v -> variable erzeugen
        System.out.println("containsMax = " + containsMax);

        boolean containsSusi = names.contains("susi");
        System.out.println("containsSusi = " + containsSusi);


        names.clear();
        System.out.println("names = " + names.size());
    }
}
