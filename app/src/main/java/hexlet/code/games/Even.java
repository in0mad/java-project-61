package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questions = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0, j = 0; i < questions.length; i++) {
            int randomNum = getRandomNumber();
            String answer = randomNum % 2 == 0 ? "yes" : "no";
            questions[i][j] = String.valueOf(randomNum);  // question
            questions[i][j + 1] = answer;  // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questions);
    }
    public static int getRandomNumber() {
        Random randNum = new Random();
        final int defaultStartNum = 0;
        final int defaultEndNum = 100;
        return randNum.nextInt(defaultStartNum, defaultEndNum);
    }
}
