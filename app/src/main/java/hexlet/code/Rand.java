package hexlet.code;

import java.util.Random;

public class Rand {
    public static int getRandomNumber() {
        java.util.Random randNum = new java.util.Random();
        return randNum.nextInt(0, 100);
    }
    public static char getRandomOperator() {
        // определение рандомного оператора
        Random rand = new Random();
        int operatorRandomizer = rand.nextInt(1, 4);
        char operator = ' ';
        // алгоритм рандомного оператора и подсчет результата
        switch (operatorRandomizer) {
            case 1:
                operator = '-';
                break;
            case 2:
                operator = '+';
                break;
            case 3:
                operator = '*';
                break;
            default:
                break;
        }
        return operator;
    }
}
