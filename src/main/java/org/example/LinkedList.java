package org.example;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        /// LinkedList - get va insert juda tez
        List<Integer> linkedList = new java.util.LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);

        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
    }
}
