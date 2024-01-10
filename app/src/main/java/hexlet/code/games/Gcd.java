package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void startTheGame() {
        String ruleOfTheGame = "Find the greatest common divisor of given numbers.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0, j = 0; i < questionsAnswers.length; i++) {
            // рандомные операнды
            int randomNum1 = getRandomNumber();
            int randomNum2 = getRandomNumber();
            // делитель
            int denominator = findDenominator(randomNum1, randomNum2);
            questionsAnswers[i][j] = randomNum1 + " " + randomNum2; // question
            questionsAnswers[i][j + 1] = String.valueOf(denominator); // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static int findDenominator(int num1, int num2) {
        int denominator = 0;
        int minFigure = Math.min(num1, num2);
        int maxFigure = Math.max(num1, num2);
        for (int f = 1; f <= minFigure; f++) {
            if (minFigure % f == 0 && maxFigure % f == 0) {
                denominator = f;
            }
        }
        return denominator;
    }
    public static int getRandomNumber() {
        Random randNum = new Random();
        final int defaultStartNum = 0;
        final int defaultEndNum = 100;
        return randNum.nextInt(defaultStartNum, defaultEndNum);
    }
}
