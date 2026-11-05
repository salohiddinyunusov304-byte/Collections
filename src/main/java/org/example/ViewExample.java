package org.example;

import java.util.ArrayList;
import java.util.List;

public class ViewExample {
    public static void main(String[] args) {
        /// View - asl collectionga qaraydi, nusxa yaratmaydi.
        // Agar viewga ozgarish kiritilsa u asl collection ga ham tasir qiladi.
        List<String> originalList = new ArrayList<>();
        originalList.add("Java");
        originalList.add("Oracle");
        originalList.add("Spring");

        // View hosil boldi
        List<String> subList = originalList;
        System.out.println(subList);

        // Viewni ozgartiramiz
        subList.set(1, "PostgreSql");

        System.out.println("View: " + subList);
        System.out.println("Original: " + originalList);
    }
}
