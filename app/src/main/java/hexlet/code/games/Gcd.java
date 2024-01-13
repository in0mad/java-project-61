package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Gcd {
    public static void startTheGame() {
        String ruleOfTheGame = "Find the greatest common divisor of given numbers.";
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
        // рандомные операнды
        int randomNum1 = Utils.getRandomNumber();
        int randomNum2 = Utils.getRandomNumber();
        // делитель
        int denominator = findGCD(randomNum1, randomNum2);
        rounds[questionArr] = randomNum1 + " " + randomNum2;  // question
        rounds[answerArr] = String.valueOf(denominator);  // answer
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
