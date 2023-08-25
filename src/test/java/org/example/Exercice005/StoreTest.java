package org.example.Exercice005;

import org.example.Exercice005.Exception.NegativeQualityException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static  final List<Product> MOCK_LIST = Arrays.asList(new Product(), new Product(),new Product());
    private Product TEST_PRODUCT;

    Store STORE;


    @BeforeEach
    void SetUp(){
        STORE = new Store();
        TEST_PRODUCT = new Product("Brie vieilli", "Dairy", 50, 50);
    }

    @Test //todo
    public void updateStore(){
        while (STORE.isSessionIsActive()){
            for (Product product:
                 MOCK_LIST) {
                    if (product.getCategory() == "Dairy"){
                        product.setSellin(product.getSellin()-1);


                } else {
                        product.setSellin();
                    }

            }

        }
        TEST_PRODUCT.setSellin();
        TEST_PRODUCT.setQualityEvolutionRate();
        TEST_PRODUCT.setQuality(TEST_PRODUCT.getQuality() + (TEST_PRODUCT.getQuality() * TEST_PRODUCT.getQualityEvolutionRate()));
    }



    @Test
    public void updateProductQuality(){
        TEST_PRODUCT.setSellin(TEST_PRODUCT.getSellin() -1);
        if (TEST_PRODUCT.getCategory() == "Dairy"){
            if (TEST_PRODUCT.getName() == "Brie vieilli"){
                TEST_PRODUCT.setQuality(TEST_PRODUCT.getQuality() +1);
            } else {
                TEST_PRODUCT.setQuality(TEST_PRODUCT.getQuality() -2);
            }
        } else {
            TEST_PRODUCT.setQuality(TEST_PRODUCT.getQuality() -1);
        }
    }


    @Test
    public void throwExceptionOnUpdateProductQualityGivenZeroOrNegativeSellin (){

        TEST_PRODUCT.setQuality(0);
        Assertions.assertThrowsExactly(NegativeQualityException.class, () -> {
        STORE.updateStore()};
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
