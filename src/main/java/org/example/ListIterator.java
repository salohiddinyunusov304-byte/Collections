package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        /// ListIterator - faqat List uchun ishlaydi, oldinga va orqaga yuradi
        // hasNext() - keyingi elm bomi
        // hasPrevious() - oldingi elm bomi
        // next() - keyingi elm
        // previous() - oldingi elm
        // set() - update
        // add() - add

        List<String> list = new ArrayList<>(List.of("Ali", "Vali", "Dali"));
        java.util.ListIterator<String> stringListIterator = list.listIterator();

        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }

        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }
    }
}
