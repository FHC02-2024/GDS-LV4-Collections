package org.campus02;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // hinzufügen von Elementen
        stringList.add("Hallo");
        stringList.add("Max");
        stringList.add("Mustermann");
        int size = stringList.size(); // die aktuelle Größe der Liste
        System.out.println("size = " + size);

        stringList.add("Neues Element");
        size = stringList.size();
        System.out.println("size = " + size);

        // Zugriff auf Elemente
        String firstElement = stringList.get(0); // index 0; Zugriff auf das erste Element
        System.out.println("firstElement = " + firstElement);
        String secondElement = stringList.get(1);
        System.out.println("secondElement = " + secondElement);

        // iteration: for-schleife
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println("element = " + element);
        }
        System.out.println();
        // iteration: for-each
        for (String element : stringList) {
            System.out.println("element = " + element);
        }

        System.out.println();
        System.out.println("nach Remove");
        // Element entfernen
        stringList.remove("Max");
        for (String element : stringList) {
            System.out.println("element = " + element);
        }
        String removedElement = stringList.remove(0);
        System.out.println("Print removed element");
        System.out.println("removedElement = " + removedElement);


        boolean containsMustermann = stringList.contains("Mustermann");
        System.out.println("containsMustermann = " + containsMustermann);

        boolean containsMax = stringList.contains("Max");
        System.out.println("containsMax = " + containsMax);

        stringList.add("Max");
        containsMax = stringList.contains("Max");
        System.out.println("containsMax = " + containsMax);
    }
}
