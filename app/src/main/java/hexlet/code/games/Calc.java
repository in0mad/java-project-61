package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    public static void startTheGame() {
        String ruleOfTheGame = "What is the result of the expression?.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        StringBuilder questionBuilder;
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0, j = 0; i < questionsAnswers.length; i++) {
            // рандомные операнды
            int randomNum1 = getRandomNumber();
            int randomNum2 = getRandomNumber();
            // переменная результата операций
            char operator = getRandomOperator();
            int arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
            // построение вопроса
            questionBuilder = new StringBuilder();
            questionBuilder.append(randomNum1).append(" ").append(operator).append(" ").append(randomNum2);
            questionsAnswers[i][j] = questionBuilder.toString();  // question
            questionsAnswers[i][j + 1] = String.valueOf(arithmeticResult);  // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
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
    public static int getRandomNumber() {
        Random randNum = new Random();
        final int defaultStartNum = 0;
        final int defaultEndNum = 100;
        return randNum.nextInt(defaultStartNum, defaultEndNum);
    }
}
