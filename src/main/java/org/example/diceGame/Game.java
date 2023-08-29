package org.example.diceGame;

public class Game {
    private Dice dice;

    public Game(Dice dice){
        this.dice = dice;
    }

    public void play(){
        if(dice.getvalue() ==6)
            System.out.println("Bravo");
        else
            System.out.println("SORRY :(((");
    }
}
