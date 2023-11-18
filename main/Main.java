package main;

import dice.Dice;

public class Main{

    public static void main(String[] args){
        System.out.println("Incializando OPRPG Battle...");

        // int dice = Dice.d20(3, 5);
        int dice = Dice.d12();
        dice = Dice.d12(2);


    }
}