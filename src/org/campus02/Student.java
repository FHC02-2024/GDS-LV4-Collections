package org.campus02;

import java.util.Objects;

public class Student {

    private int matrNr;
    private String fullName;

    // ALT + EINFG -> Constructor
    // od. CODE - Generate -> Constructor
    public Student(int matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matrNr);
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrNr=" + matrNr +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}


