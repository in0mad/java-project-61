package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
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
        int randomNum = Utils.getRandomNumber();
        String resultEven = isEven(randomNum) ? "yes" : "no";
        rounds[questionArr] = String.valueOf(randomNum);  // question
        rounds[answerArr] = resultEven;  // answer
    }
    public static boolean isEven(int randomNum) {
        return randomNum % 2 == 0;
    }
}
