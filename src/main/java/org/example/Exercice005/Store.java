package org.example.Exercice005;

import org.example.Exercice005.Exception.NegativeQualityException;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    private boolean sessionIsActive;

    public List<Product> updateStore (){
        List<Product> products = null;
            for(int i = 0; i <= products.size(); i++) {
                products.get(i).setSellin(-i);
                if(products.get(i).getQuality() > 0){
                    products.get(i).setQuality(products.get(i).factorQuality());
                } else {
                    products.get(i).setQuality(0);
                }
            }
        return products;
    }



    public boolean isSessionIsActive() {
        return sessionIsActive;
    }
}
