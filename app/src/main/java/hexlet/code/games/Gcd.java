package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int rightAnswers = 0;
        int answer;
        for (int i = 0; i < 3; i++) {
            // рандомные операнды
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();
            // делитель
            int denominator = 0;
            // основная логика игры
            System.out.printf("Question: %d %d\n", randomNum1, randomNum2);
            System.out.print("Your answer: ");
            answer = Engine.getIntAnswer();
            if (randomNum1 - randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum1 + randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum1 * randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum1 - randomNum2 != answer) {
                Engine.callFaultMessage(answer, denominator, username);
//                System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, denominator);
//                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (randomNum1 + randomNum2 != answer) {
                Engine.callFaultMessage(answer, denominator, username);
//                System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, denominator);
//                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (randomNum1 * randomNum2 != answer) {
                Engine.callFaultMessage(answer, denominator, username);
//                System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, denominator);
//                System.out.println("Let's try again, " + username + "!");
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
    public static int findDenominator(int num1, int num2) {
        int denominator = 0;
        return denominator;
    }
}
