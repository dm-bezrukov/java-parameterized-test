package ru.yandex.practicum;

public class AgeChecker {

    public boolean isAdult(int age, String country) {
        if (age >= 18 && !country.equalsIgnoreCase("USA")) {
            return true;
        } else return age >= 21;
    }
}
