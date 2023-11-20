package dice;
import java.util.Random;


public class Dice {
    
    public static int rollD20(int numberOfDices, int advantages){
        int[] values;
        int finalValue;

        System.out.println("Valor do atributo: " + numberOfDices);
        System.out.println("Bônus de +" + advantages);

        if (numberOfDices  <= 0){
            values = new int[2];
            finalValue = 20;

            for (int i = 0; i < 2; i++){
                Random random = new Random();
                values[i] = random.nextInt(1, 21);

                if (values[i] < finalValue) finalValue = values[i];

                System.out.println("Dado nº" + i + ": "  + values[i]);
            }
            System.out.println("Resultado: " + (finalValue + advantages));
            return finalValue + advantages;

        } else {
            values = new int[numberOfDices];
            finalValue = 1;

            for (int i = 0; i < values.length; i++){
                Random random = new Random();
                values[i] = random.nextInt(1, 21);

                if (values[i] > finalValue) finalValue = values[i];

                System.out.println("Dado nº" + i + ": "  + values[i]);
            }
            System.out.println("Resultado: " + (finalValue + advantages));
            return finalValue + advantages;

        }
    }

    public static int rollDice(int sides, int numberOfDices){
        int counter = 0;
        int finalResult = 0;

        System.out.println("Rolando dado de " + sides + " lados...");

        while (counter < numberOfDices){

            Random random = new Random();
            int result = random.nextInt(1, sides + 1);
            finalResult += result;
            
            counter++;

            System.out.println("Dado " + counter + ": " + result);
        }

        System.out.println("Resultado final: " + finalResult);
        return finalResult;
    }
    public static int rollDice(int sides){

        System.out.println("Rolando dado de " + sides + " lados...");
        
        Random random = new Random();
        int result = random.nextInt(1, sides + 1);

        System.out.println("Resultado: " + result);
        return result;
    }

    
}
