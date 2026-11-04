package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        /// HashMap - key-value, xesh kod boyicha saqlaydi, tartibsiz, 1 ta key null, get juda tez

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ali");
        hashMap.put(2, "Vali");

        System.out.println(hashMap.get(2));

        /// TreeMap - key saralangan osish tartibid, null key yo'q

    }
}
