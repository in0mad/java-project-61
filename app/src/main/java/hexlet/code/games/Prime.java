package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        // рандомный операнд
        int defaultStartNumRandom = 2;
        int randomNum = Utils.getRandomNumber(defaultStartNumRandom);
        // поиск prime number
        String realPrimeNumber = findPrimeNum(randomNum);
        rounds[questionArr] = String.valueOf(randomNum);  // question
        rounds[answerArr] = realPrimeNumber;  // answer
    }
    public static String findPrimeNum(int number) {
        String result = "yes";
        final int primeChecker = 3;
        int counter = 0;
        for (int f = 1; f <= number; f++) {
            if (number % f == 0) {
                counter++;
            }
            if (counter >= primeChecker) {
                result = "no";
                return result;
            }
        }
        return result;
    }
}
