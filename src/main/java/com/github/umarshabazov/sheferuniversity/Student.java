package com.github.umarshabazov.sheferuniversity;

import java.util.Objects;

public class Student {


    public String name;
    public String grade;

    @Override
    public String toString() {
        return "Hello, my name is " + name + ". I am in " + grade + " grade.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(this.name, student.name) && Objects.equals(this.grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
