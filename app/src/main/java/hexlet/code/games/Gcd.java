package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int rightAnswers = 0;
        int roundCounter = 3;
        int answer;  // переменная - считыватель ответа пользователя
        for (int i = 0; i < roundCounter; i++) {
            // рандомные операнды
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();
            // делитель
            int denominator = findDenominator(randomNum1, randomNum2);
            // основная логика игры
            System.out.printf("Question: %d %d\n", randomNum1, randomNum2);
            System.out.print("Your answer: ");
            answer = Engine.getIntAnswer();
            if (answer == denominator) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                Engine.callFaultMessage(answer, denominator, username);
                break;
            }
        }
        if (rightAnswers == roundCounter) {
            System.out.printf("Congratulations, %s!\n", username);
        }
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
