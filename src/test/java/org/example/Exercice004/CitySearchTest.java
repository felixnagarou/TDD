package org.example.Exercice004;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CitySearchTest {
    final static List<String> TEST_CITIES = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
            "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome");

    public static CitySearch citySearch;


    @Test
    public void CityIsAtLeastTwoChars(){
        Assertions.assertFalse(TEST_CITIES.get(0).codePointCount(0, -1) >= 2);
    }

    @Test
    public void InputReadIsNotLowerCaseSensitive(){
        String testCity = "paRis";
        Assertions.assertEquals(testCity, (TEST_CITIES.get(0).toLowerCase()));
    }

    @Test
    public void InputReadIsNotUpperCaseSensitive(){
        String testCity = "pAriS";
        Assertions.assertEquals(testCity, (TEST_CITIES.get(0).toUpperCase()));
    }

    @Test
    public void CityCanBeSuggestedGivenFirstTwoChars(){
        String testCity = "Va";
        Assertions.assertEquals(testCity, TEST_CITIES.get(0).substring(0, 2));
    }

    @Test
    public void CityCanBeSuggestedGivenInputIsNotFullName(){
        String testCity = "ri";
        Assertions.assertEquals(testCity, TEST_CITIES.get(0).substring(0, TEST_CITIES.get(0).length()));
    }

    @Test
    public void AllCitiesCanBeDisplayed(){
        
    }



}
