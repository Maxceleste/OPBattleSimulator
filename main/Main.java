package main;

import dice.Dice;

public class Main{

    public static void main(String[] args){
        System.out.println("Incializando OPRPG Battle...");

        System.out.println("***************************************");
        Dice.rollD20(3, 5);
        System.out.println("***************************************");
        Dice.rollDice(12);
        System.out.println("***************************************");
        Dice.rollDice(12, 2);
        System.out.println("***************************************");
        Dice.rollDice(10);
        System.out.println("***************************************");
        Dice.rollDice(10, 2);
        System.out.println("***************************************");
        Dice.rollDice(8);
        System.out.println("***************************************");
        Dice.rollDice(8, 2);
        System.out.println("***************************************");
        Dice.rollDice(6);
        System.out.println("***************************************");
        Dice.rollDice(6, 2);
        System.out.println("***************************************");
        Dice.rollDice(4);
        System.out.println("***************************************");
        Dice.rollDice(4, 2);
        System.out.println("***************************************");

    }
}