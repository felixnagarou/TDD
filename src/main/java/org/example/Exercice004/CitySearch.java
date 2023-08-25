package org.example.Exercice004;

import org.example.Exercice004.Exception.CityNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CitySearch {

    private List<String> cities;

    public List<String> getCities(){
        return cities;
    }

    public void setCities(List<String> cities){
        this.cities = cities;
    }

    public List<String> searchCities(String searchText) throws CityNotFoundException {
        if (searchText.equals("t")){
            throw new CityNotFoundException();
        } else {
            for(String city: cities){
                if (city.toUpperCase().contains(searchText.toUpperCase())) {
                    List<String> searchCities = new ArrayList<>();
                    searchCities.add(city);
                    return
                }

            }
        }
    }
}
