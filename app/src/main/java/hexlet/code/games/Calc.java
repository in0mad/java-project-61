package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {
    public static void startTheGame() {
        String ruleOfTheGame = "What is the result of the expression?.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundData();
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static String[] generateRoundData() {
        int randomNum1 = Utils.getRandomNumber();
        int randomNum2 = Utils.getRandomNumber();
        // переменная результата операций
        char operator = getRandomOperator();
        int arithmeticResult = 0;
        try {
            arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        // построение вопроса
        String question = String.format("%d %c %d", randomNum1, operator, randomNum2); // question
        String answer = String.valueOf(arithmeticResult);  // answer
        return new String[]{question, answer};
    }
    public static int makeArithmeticResult(char operator, int num1, int num2) throws Exception {
        String errorMessage = String.format("%c is a wrong operator in the round generator", operator);
        return switch (operator) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '*' -> num1 * num2;
            default -> throw new Exception(errorMessage);
        };
    }
    public static char getRandomOperator() {
        // определение рандомного оператора
        Random rand = new Random();
        final int defaultOperatorStart = 0;
        final int defaultOperatorFinish = 3;
        int operatorRandomizer = rand.nextInt(defaultOperatorStart, defaultOperatorFinish);
        char[] symbols = {'-', '+', '*'};
        return symbols[operatorRandomizer];
    }
}
