package org.example.Exercice005;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static  final List<Product> MOCK_LIST = Arrays.asList(new Product(), new Product(),new Product());
    private Product product;

    @BeforeEach
    void SetUp(){
        product = new Product();
    }

    @Test
    public void updateStore(){
    }





    @Test
    public  void ProductQualityShouldDecreaseTwiceAsFastGivenSellinIsNegative(){
        Assertions.assertTrue(product.getSellin() <= 0);
    }

    public  void ProductQualityShouldNotBeNegativeNorOverFifty(){
        Assertions.assertFalse(product.getQuality() < 0 && product.getQuality() > 50);
    }

    public void ProductQualityIncreasesOverTimeWhenNameIsEquivalentToBrieVieilli(){
        Assertions.assertFalse(product.getName().equals("Brie Vielli"));
        Assertions.assertFalse(product.getQualityEvolutionRate() > 0);
    }

    public void ProductQualityDecreasesTwiceAsFastIfProductCategoryIsDairy(){
        Assertions.assertFalse(product.getCategory() == "Dairy");
        Assertions.assertFalse(product.getQualityEvolutionRate() == Product.baseEvolutionRate * 2);
    }



}
