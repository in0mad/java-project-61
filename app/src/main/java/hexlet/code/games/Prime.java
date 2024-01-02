package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int rightAnswers = 0;
        int answer; // переменная - считыватель ответа пользователя
        for (int i = 0; i < 3; i++) {
            // рандомный операнд и поиск prime number
            int randomNum = Engine.getRandomNumber();
            int primeNumber = findPrimeNum(randomNum);
            // основная логика игры
            System.out.printf("Question: %d\n", randomNum);
            System.out.print("Your answer: ");
            answer = Engine.getIntAnswer();
            if (answer == primeNumber) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                Engine.callFaultMessage(answer, primeNumber, username);
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
    public static int findPrimeNum(int number) {
        int result = 0;
        return result;
    }
}
