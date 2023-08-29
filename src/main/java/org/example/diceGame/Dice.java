package org.example.diceGame;

import java.util.Random;

public class Dice {

    private Random random;

    public Dice() {
        Random random = new Random();
    }
    public int getvalue(){
        return random.nextInt(1, 7);
    }
}
