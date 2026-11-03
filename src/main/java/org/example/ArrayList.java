package org.example;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        /// ArrayList - Get tez, Insert sekin
        List<String> arrayList = new java.util.ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A"); // takroriy ruxsat

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
    }
}
