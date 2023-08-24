package org.example.Exercice003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class YearTest {
    final static List<Long> TEST_VALUES = Arrays.asList(32L, 2000L, 20000L); ;
    @Test
    public void TestIsYearLeap1() {
        Year testYear = new Year();
        Assertions.assertEquals(true, testYear.IsYearLeap(TEST_VALUES.get(0)));

    }

    @Test
    public void TestIsLeapYear2() {
        Year testYear = new Year();
        Assertions.assertEquals(true, testYear.IsYearLeap(TEST_VALUES.get(1)));
    }


    @Test
    public void TestIsLeapYear3() {
        Year testYear = new Year();

        Assertions.assertEquals(true, testYear.IsYearLeap(TEST_VALUES.get(2)));
    }

}


