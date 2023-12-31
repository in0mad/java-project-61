package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void startTheGame() {
        String ruleOfTheGame = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questions = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0, j = 0; i < questions.length; i++) {
            // рандомный операнд
            int randomNum = getRandomNumber(i + 1);
            // поиск prime number
            String isPrimeNumber = findPrimeNum(randomNum);
            questions[i][j] = String.valueOf(randomNum); // question
            questions[i][j + 1] = isPrimeNumber;  // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questions);
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
    public static int getRandomNumber(int start) {
        Random randNum = new Random();
        final int defaultEnd = 100;
        return randNum.nextInt(start, defaultEnd);
    }
}
