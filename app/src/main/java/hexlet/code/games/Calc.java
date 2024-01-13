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
        int arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
        // построение вопроса
        questionBuilder = new StringBuilder();
        questionBuilder.append(randomNum1).append(" ").append(operator).append(" ").append(randomNum2);
        rounds[questionArr] = questionBuilder.toString();  // question
        rounds[answerArr] = String.valueOf(arithmeticResult);  // answer
    }
    public static int makeArithmeticResult(char operator, int num1, int num2) {
        int arifmeticResult = 0;
        switch (operator) {
            case '-':
                arifmeticResult = num1 - num2;
                break;
            case '+':
                arifmeticResult = num1 + num2;
                break;
            case '*':
                arifmeticResult = num1 * num2;
                break;
            default:
                break;
        }
        return arifmeticResult;
    }
    public static char getRandomOperator() {
        // определение рандомного оператора
        Random rand = new Random();
        final int defaultOperatorStart = 1;
        final int defaultOperatorFinish = 4;
        int operatorRandomizer = rand.nextInt(defaultOperatorStart, defaultOperatorFinish);
        char operator = ' ';
        final int minus = 1;
        final int plus = 2;
        final int multiply = 3;
        // алгоритм рандомного оператора
        switch (operatorRandomizer) {
            case minus:
                operator = '-';
                break;
            case plus:
                operator = '+';
                break;
            case multiply:
                operator = '*';
                break;
            default:
                break;
        }
        return operator;
    }
}
