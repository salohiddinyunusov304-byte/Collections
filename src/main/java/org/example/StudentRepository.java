package org.example;

import java.util.Optional;

public class StudentRepository {
    public static Optional<String> findStudentById(int id) {
        if (id == 1) {
            return Optional.of("Salohiddin");
        }
        else {
            return Optional.empty();
        }
    }
}
