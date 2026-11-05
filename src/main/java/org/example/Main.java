package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /// Collections.sort(list) - royxatni osish tartibida saralaw
        /// Collections.binarySearch(list, key) - saralangan royxatdan elementni tez topadi
        /// Collections.reverse(list) - royxatni teskari qiladi
        /// Collections.shuffle(list) - tasodifiy aralashtirish
        /// Collections.min(list) / max(list) - eng kichik va kattasini topish
        /// Collections.frequency(list, object) - element necha martta takrorlagani

        List<Integer> list = new ArrayList<>(List.of(5, 4, 10, 3, 1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list, 3));

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.min(list));

        System.out.println(Collections.frequency(list, 3));

        /// Optional - return bor yoki yoq deb aytadi

        // Optional.of(value) - agar qiymat aniq null bolmasa ishlatasiz
        // Optional.ofNullable(value) - qiymat null bolishi mumkin bolgan holatlarda
        // isPresent() - ichida malumot bomi yomi (true/false)
        // orElse(other) - agar ichida qiymat bolmasa, orniga other ni oladi
        // orElseThrow() - agar qiymat bolmasa exception tashlaydi

        // 1 - holat (Mavjud)
        Optional<String> studentById = StudentRepository.findStudentById(1);
        if (studentById.isPresent()) {
            System.out.println(studentById.get());
        }

        // 2 - holat (Mavjud emas)
        Optional<String> studentById1 = StudentRepository.findStudentById(2);
        String s = studentById1.orElse("Nomalum talaba");
        System.out.println(s);

        // 3 0 holt (Lambda)
        StudentRepository.findStudentById(1)
                .ifPresent(name -> System.out.println(name));
    }
}