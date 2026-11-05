package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        /// Iterator - collection elementlarini yurib chiqish u-n
        // faqat oldinga yuradi, xavfsiz ochirish
        // hasNext() - keyingi malumot bormi
        // next() - malumot olish

        List<String> list = new ArrayList<>(List.of("Java", "Oracle", "PostgreSql"));
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);

            if (item == "Oracle") {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
