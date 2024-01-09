package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questions = new String[3][2];
        for (int i = 0, j = 0; i < questions.length; i++) {
            int randomNum = Engine.getRandomNumber();
            String answer = randomNum % 2 == 0 ? "yes" : "no";
            questions[i][j] = String.valueOf(randomNum);  // question
            questions[i][j + 1] = answer;  // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questions);
    }
}
