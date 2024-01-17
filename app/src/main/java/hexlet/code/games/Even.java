package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundData();
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static String[] generateRoundData() {
        String[] questionAndAnswer = new String[2];
        int randomNum = Utils.getRandomNumber();
        String resultEven = isEven(randomNum) ? "yes" : "no";
        questionAndAnswer[0] = String.valueOf(randomNum);  // question
        questionAndAnswer[1] = resultEven;  // answer
        return questionAndAnswer;
    }
    public static boolean isEven(int randomNum) {
        return randomNum % 2 == 0;
    }
}
