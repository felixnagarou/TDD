package org.example.Exercice004;

import org.example.Exercice004.Exception.CityNotFoundException;

import java.util.List;

public class CitySearch {

    private List<String> cities;

    public List<String> getCities(){
        return cities;
    }

    public void setCities(List<String> cities){
        this.cities = cities;
    }

    public void searchCities(String searchText) throws CityNotFoundException {
        if (searchText.equals("t")){
            throw new CityNotFoundException();
        }
    }
}
