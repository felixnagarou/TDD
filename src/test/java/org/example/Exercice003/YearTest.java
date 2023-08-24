package org.example.Exercice003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YearTest {
    @Test
    public void TestIsLeapYear(){
        Year testYear = new Year();
        final long TEST_VALUE = 2000;
        Assertions.assertEquals(true, testYear.IsYearLeap(TEST_VALUE));
    }
}
