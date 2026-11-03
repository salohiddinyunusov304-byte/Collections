package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        /// HashSet - unical qiymat, tartibsiz, get va set juda tez
        Set<String> hashSetExample = new HashSet<>();
        hashSetExample.add("Toshkent");
        hashSetExample.add("Andijon");
        hashSetExample.add("Tashkent");

        System.out.println(hashSetExample);

        /// TreeSet - Red-Black Tree asosida, natural order, unical
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(10); // hisoblamaydi
        treeSet.add(20);

        System.out.println(treeSet);

    }
}
