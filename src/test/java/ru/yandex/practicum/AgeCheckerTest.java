package ru.yandex.practicum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class AgeCheckerTest {

    @DisplayName("Should show correct result of age check")
    @ParameterizedTest
    @CsvFileSource(resources = "/IsAdultTestData.csv", numLinesToSkip = 1)
    public void isAdultTest(int age, String country, boolean result) {
        AgeChecker ageChecker = new AgeChecker();
        boolean isAdult = ageChecker.isAdult(age, country);
        Assertions.assertEquals(result, isAdult, "Ожидалось " + result);
    }
}
