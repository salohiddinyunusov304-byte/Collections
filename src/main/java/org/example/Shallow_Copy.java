package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shallow_Copy {
    public static void main(String[] args) {
        /// Shallow copy - obyektni ozi nnusxalanadi, ichidagi refer emas
        List<String> list1 = new ArrayList<>();
        list1.add("Salohiddin");

        // Shallow copy (ArrayList constructori yoki clone orqali)
        List<String> list2 = new ArrayList<>(list1);
        list2.add("Jasur");

        System.out.println("Original: " + list1);
        System.out.println("ShallowCopy: " + list2);
    }
}
