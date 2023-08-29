package org.example.hangmanGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    private static MockWordSetGeneratorImpl mockWordSet;

    private static final char MOCKCHAR = 'c';

    private static final String MOCKWORD = "cat";
    Game game;



    @BeforeEach
    void setUp(){
         game = new Game(mockWordSet);
         game.setNumberOfTries(1);
         game.setTriesCounter(1);
         game.setWordToFind(MOCKWORD);
    }




    @Test void wordListShouldNotBeNull(){
        Assertions.assertTrue(mockWordSet.equals(null));
    }


    @Test
    public void charInputShouldBeAlphabetical(){
        Assertions.assertEquals(MOCKCHAR, 'c');
    }

    @Test
    public void charInputShouldBeFormatted(){
        Assertions.assertTrue(MOCKCHAR == 'C');
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
        Assertions.assertFalse(game.getTriesCounter() == game.getNumberOfTries());
    }

    @Test
    public void gameShouldUnmaskCharWhenCharIsFound(){
        Assertions.assertEquals(false, game.isCharFound());
    }

    @Test
    public void gameShouldIncrementTryCounterWhenCharIsNotFound(){
        Assertions.assertEquals(true, game.isCharFound());
    }

    @Test
    public void maskShouldReturnMaskedWordOfSameLengthAsWordToFind(){
        Assertions.assertEquals(game.getWordToFind().length(), game.mask(mockWordSet).length());
    }


}
