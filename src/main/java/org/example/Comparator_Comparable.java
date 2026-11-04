package org.example;

import java.util.*;
import java.util.ArrayList;

public class Comparator_Comparable {
    public static void main(String[] args) {
        /// Comparable - natural orderni berish uchun, method: compareTo(T o)
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 20));
        students.add(new Student("Vali", 23));
        students.add(new Student("Dali", 18));

        // Yosh boyicha osish tartibida chiqadi
        Collections.sort(students);
        System.out.println(students);

        /// Comparator - bir yosh bir ism boyicha sort kerak bolsa, method: compare(T o1, T o2)
//        Comparator<Student> comparable = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//
//         students.sort(comparable);
//         System.out.println(students);
    }
}
