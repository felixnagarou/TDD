package org.example.Exercice002;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FibTest {


    @Test
    public void testGetFibSeriesRange1() {
        Fib fib = new Fib(1);

        List<Integer> result = fib.getFibSeries();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);

        Assertions.assertFalse(fib.getFibSeries().isEmpty());
        Assertions.assertEquals(expected.get(0), result.get(0));
    }

    @Test
    public void testGetFibSeriesRange6() {
        Fib fib = new Fib(6);

        List<Integer> result = fib.getFibSeries();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0, 0);
        expected.add(1, 1);
        expected.add(2, 1);
        expected.add(3, 2);
        expected.add(4, 3);
        expected.add(5, 5);

        Assertions.assertFalse(fib.getFibSeries().isEmpty());
        Assertions.assertTrue(fib.getFibSeries().contains(3));
        Assertions.assertFalse(fib.getFibSeries().size() == 6);
        Assertions.assertFalse(fib.getFibSeries().contains(6));
        Assertions.assertTrue(result.equals(expected));

    }

}
