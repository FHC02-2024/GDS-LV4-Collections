package org.campus02;

import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        Student max = new Student(1, "max");
        Student susi = new Student(2, "susi");

        students.add(max);
        students.add(susi);
        students.add(new Student(3, "john"));

        // duplikate nicht erlaubt
        students.add(max);

        for (Student s : students) {
            System.out.println(s);
            System.out.println(s.hashCode());
        }


        System.out.println();
        students.remove(susi);
        for (Student s : students) {
            System.out.println(s);
            System.out.println(s.hashCode());
        }

        Student max2 = new Student(4, "max");
        students.add(max2);

        System.out.println();
        for (Student s : students) {
            System.out.println(s);
            System.out.println(s.hashCode());
        }

        Student maria = new Student(1, "maria");
        students.add(maria);

        System.out.println();
        for (Student s : students) {
            System.out.println(s);
            System.out.println(s.hashCode());
        }
    }
}
