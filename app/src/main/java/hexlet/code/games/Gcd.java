package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    public static void startTheGame() {
        String ruleOfTheGame = "Find the greatest common divisor of given numbers.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundData();
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static String[] generateRoundData() {
        // рандомные операнды
        int randomNum1 = Utils.getRandomNumber();
        int randomNum2 = Utils.getRandomNumber();
        // делитель
        int denominator = findGCD(randomNum1, randomNum2);
        String question = randomNum1 + " " + randomNum2;  // question
        String answer = String.valueOf(denominator);  // answer
        return new String[]{question, answer};
    }
    public static int findGCD(int num1, int num2) {
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
}
