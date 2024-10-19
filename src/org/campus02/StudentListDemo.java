package org.campus02;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student max = new Student(1, "Max Mustermann");
        Student susi = new Student(2, "Susi Sorglos");

        students.add(max);
        students.add(susi);
        students.add(new Student(3, "John Doe"));
        System.out.println(students.size());
        for (Student s : students) {
            System.out.println("s = " + s);
        }

        students.remove(max); // max entfernt
        students.remove(0); // entferne das erste Element

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student mit index " + i +
                                       " ist in unserer Liste wie folgt angelegt: " + students.get(i));
        }

        boolean containsMax = students.contains(max);
        System.out.println("containsMax = " + containsMax); // hier erwarten wir uns: false

        students.add(susi);
        boolean containsSusi = students.contains(susi);
        System.out.println("containsSusi = " + containsSusi); // hier erwarten wir uns: true


        for (Student s : students) {
            System.out.println("s = " + s);
        }
        boolean containsJohn = students.contains(new Student(3, "John Doe")); // hier erwarten wir uns: false
        System.out.println("containsJohn = " + containsJohn);


    }
}
