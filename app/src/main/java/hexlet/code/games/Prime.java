package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rightAnswers = 0;
        String answer; // переменная - считыватель ответа пользователя
        for (int i = 0; i < Engine.ROUND_COUNTER; i++) {
            // рандомный операнд и поиск prime number
            int randomNum = Engine.getRandomNumber(i + 1);
            String isPrimeNumber = findPrimeNum(randomNum);
            // основная логика игры
            System.out.printf("Question: %d\n", randomNum);
            System.out.print("Your answer: ");
            answer = Engine.getTextAnswer();
            if (answer.equals(isPrimeNumber)) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                Engine.callFaultMessage(answer, isPrimeNumber, username);
                break;
            }
        }
        if (rightAnswers == Engine.ROUND_COUNTER) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
    public static String findPrimeNum(int number) {
        String result = "yes";
        final int prime_CHECKER = 3;
        int counter = 0;
        for (int f = 1; f <= number; f++) {
            if (number % f == 0) {
                counter++;
            }
            if (counter >= prime_CHECKER) {
                result = "no";
                return result;
            }
        }
        return result;
    }
}
