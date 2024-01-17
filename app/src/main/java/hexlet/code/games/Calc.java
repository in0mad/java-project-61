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
        for (String[] rounds : questionsAnswers) {
            generateRoundData(rounds);
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static void generateRoundData(String[] rounds) {
        final int questionArr = 0;
        final int answerArr = 1;
        StringBuilder questionBuilder;
        int randomNum1 = Utils.getRandomNumber();
        int randomNum2 = Utils.getRandomNumber();
        // переменная результата операций
        char operator = getRandomOperator();
        int arithmeticResult = 0;
        try {
            arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        // построение вопроса
        questionBuilder = new StringBuilder();
        questionBuilder.append(randomNum1).append(" ").append(operator).append(" ").append(randomNum2);
        rounds[questionArr] = questionBuilder.toString();  // question
        rounds[answerArr] = String.valueOf(arithmeticResult);  // answer
    }
    public static int makeArithmeticResult(char operator, int num1, int num2) throws Exception {
        return switch (operator) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '*' -> num1 * num2;
            default -> throw new Exception(operator + " is a wrong operator. Declared '-', '+', '*' only");
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
//        final int minus = 1;
//        final int plus = 2;
//        final int multiply = 3;
//        // алгоритм рандомного оператора
//        switch (operatorRandomizer) {
//            case minus:
//                return symbols[0];
//            case plus:
//                return symbols[1];
//            case multiply:
//                return symbols[2];
//            default:
//                break;
//        }
    }
}
