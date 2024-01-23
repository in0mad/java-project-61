package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final char[] SYMBOLS = {'-', '+', '*'};
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
        int arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
        String question = String.format("%d %c %d", randomNum1, operator, randomNum2); // question
        String answer = String.valueOf(arithmeticResult);  // answer
        return new String[]{question, answer};
    }

    public static int makeArithmeticResult(char operator, int num1, int num2) {
        String errorMessage = String.format("'%c' is a wrong operator in the round generator", operator);
        return switch (operator) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException(errorMessage);
        };
    }

    public static char getRandomOperator() {
        // определение рандомного оператора
        final int operatorStart = 0;
        int operatorRandomizer = Utils.getRandomNumber(operatorStart, SYMBOLS.length);
        return SYMBOLS[operatorRandomizer];
    }
}
