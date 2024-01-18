package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundData();
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static String[] generateRoundData() {
        int endRandomBorder = 100;
        // рандомный операнд
        int defaultStartNumRandom = 2;
        int randomNum = Utils.getRandomRangeNumber(defaultStartNumRandom, endRandomBorder);
        // поиск prime number
        String question = String.valueOf(randomNum);  // question
        String answer = isPrimeNum(randomNum) ? "yes" : "no";  // answer
        return new String[]{question, answer};
    }
    public static boolean isPrimeNum(int number) {
        boolean result = true;
        int primeChecker = 3;
        int counter = 0;
        for (int f = 1; f <= number; f++) {
            if (number % f == 0) {
                counter++;
            }
            if (counter >= primeChecker) {
                result = false;
                return result;
            }
        }
        return result;
    }
}
