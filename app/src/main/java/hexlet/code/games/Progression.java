package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("What number is missing in the progression?");
        int rightAnswers = 0;
        int answer;
        for (int i = 0; i < 3; i++) {
            // рандомные операнды
            int randomNum1 = Engine.getRandomNumber();
            int randomNum2 = Engine.getRandomNumber();

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
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
}
