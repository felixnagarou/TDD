package org.example;

import org.example.Demo.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatriceTest {

    //test de la méthode addition

    @Test
    public  void testAddition(){
        //A => Arrange
        Calculatrice calculatrice = new Calculatrice();

        //A Act
        double result = calculatrice.addition(10, 20);

        //A => Assert
        Assertions.assertEquals(30, result);

    }


    @Test
    public void testDivisionAvecBDiff0(){
        Calculatrice calculatrice = new Calculatrice();

        double result = calculatrice.division(10, 0);

        Assertions.assertEquals(5, result);

        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            //A -> act
            calculatrice.division(10, 0);
        });
    }
}
