package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startTheGame() {
        String ruleOfTheGame = "Find the greatest common divisor of given numbers.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questions = new String[3][2];
        for (int i = 0, j = 0; i < questions.length; i++) {
            // рандомные операнды
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();
            // делитель
            int denominator = findDenominator(randomNum1, randomNum2);
            questions[i][j] = randomNum1 + " " + randomNum2; // question
            questions[i][j+1] = String.valueOf(denominator); // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questions);
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
}
