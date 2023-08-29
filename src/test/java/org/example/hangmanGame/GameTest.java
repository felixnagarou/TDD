package org.example.hangmanGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    private static MockWordSetGeneratorImpl mockWordSet;

    private static final char MOCKCHAR = 'c';
    Game game;



    @BeforeEach
    void setUp(){
         game = new Game(mockWordSet);
    }


    @Test
    public void wordGenerationShouldBeRandomised(){

    }

    @Test void wordListShouldNotBeNull(){
        Assertions.assertTrue(mockWordSet.equals(null));
    }


    @Test
    public void charInputShouldBeAlphabetical(){
        Assertions.assertEquals(MOCKCHAR, 'c');
    }

    @Test
    public void charInputShouldNotBeNull(){
        Assertions.assertEquals((Character) null, MOCKCHAR);
    }

    @Test
    public void gameShouldReturnWinMessageIfWordIsFound(){
        Assertions.assertEquals( false, game.isWordIsFound());
    }

    @Test
    public void gameShouldReturnLossMessageWhenNumberOfTriesIsExceeded(){
        Assertions.assertFalse(game.getTriesCounter() > game.getNumberOfTries());
    }
    public void gameShouldUnmaskCharWhenCharisFound(){
        Assertions.assertEquals(false, game.isCharFound());
    }

    public void gameShouldIncrementTryCounterWhenCharIsNotFound(){
        Assertions.assertEquals(true, game.isCharFound());
    }


}
