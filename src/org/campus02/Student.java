package org.campus02;

public class Student {

    private int matrNr;
    private String fullName;

    // ALT + EINFG -> Constructor
    // od. CODE - Generate -> Constructor
    public Student(int matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }

    // ALT + EINFG -> toString()
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}


