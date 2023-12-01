package main;

import dice.Dice;
import generator.*;

public class Main{

    public static void main(String[] args){
        System.out.println("Incializando OPRPG Battle...");

        boolean showText = false;

        System.out.println("***************************************");
        Dice.rollD20(3, 5, showText);
        System.out.println("***************************************");
        Dice.rollDice(12, showText);
        System.out.println("***************************************");
        Dice.rollDice(12, showText, 2);
        System.out.println("***************************************");
        Dice.rollDice(10, showText);
        System.out.println("***************************************");
        Dice.rollDice(10, showText, 2);
        System.out.println("***************************************");
        Dice.rollDice(8, showText);
        System.out.println("***************************************");
        Dice.rollDice(8, showText, 2);
        System.out.println("***************************************");
        Dice.rollDice(6, showText);
        System.out.println("***************************************");
        Dice.rollDice(6, showText, 2);
        System.out.println("***************************************");
        Dice.rollDice(4, showText);
        System.out.println("***************************************");
        Dice.rollDice(4, showText, 2);
        System.out.println("***************************************");

        CharacterGen c = new CharacterGen();

        String[] origin = c.genOrigin();

        for (String o : origin) System.out.println(o);
        
    }
}