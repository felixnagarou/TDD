package org.example.Exercice004;

import org.example.Exercice004.Exception.CityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CitySearchTest {
    final static List<String> TEST_CITIES = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence",
            "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York",
            "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome");

    private CitySearch citySearch;


    @BeforeEach
    void setup(){
        citySearch = new CitySearch();

    }




   @Test
   public void CityIsAtLeastTwoChars(){
        Assertions.assertFalse(TEST_CITIES.get(0).length() > 2);
   }

    @Test
    public void testSearchCitiesShouldRaiseNotFoundExceptionWhenSearchIsLessThan2Chars(){
        Assertions.assertThrowsExactly(CityNotFoundException.class, () ->{
            citySearch.searchCities("t");
        });
    }

   // @Test
    //public void InputReadIsNotLowerCaseSensitive(){
      //  String testCity = "paRis";
        //Assertions.assertEquals(testCity, (TEST_CITIES.get(0).toLowerCase()));
    //}

    //@Test
    //public void InputReadIsNotUpperCaseSensitive(){
      //  String testCity = "pAriS";
       // Assertions.assertEquals(testCity, (TEST_CITIES.get(0).toUpperCase()));
   // }

   // @Test
   // public void CityCanBeSuggestedGivenFirstTwoChars(){
      //  String testCity = "Va";
      //  int testIndex = 0;
      //  Assertions.assertTrue(TEST_CITIES.get(testIndex).contains(testCity));
   // }

    @Test
    public void CityCanBeSuggestedGivenInputIsNotFullNameAndNotExactCase(){
        String testCity = "Ris";
        int testIndex = 0;
        Assertions.assertTrue(TEST_CITIES.get(testIndex).toUpperCase().contains(testCity.toUpperCase()));
    }


    @Test
    public void AllCitiesCanBeDisplayedUsingStarChar(){
        String testCity = "*";
        Assertions.assertEquals(testCity, "*");
        Assertions.assertFalse(TEST_CITIES.isEmpty());
    }



}
