package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /// WildCard Tyoes - 3 xil:
        // Unbounded Wildcard (<?>),
        // Upper Bounded Wildcard (<? extends T> — PECS prinsipi: Producer Extends)
        // Lower Bounded Wildcard (<? super T> — PECS prinsipi: Consumer Super)

        List<?> wildCard1 = new ArrayList<>(List.of("Ali", "Vali", 2));
        System.out.println(wildCard1);

        List<? extends Number> wildCard2 = new ArrayList<>(List.of(0, 1, 2));
        System.out.println(wildCard2);

    }
}