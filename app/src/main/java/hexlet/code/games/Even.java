package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int rightAnswers = 0;
        String answer;
        String correctAnswer;
        for (int i = 0; i < 3; i++) {
            int randomNum = Engine.getRandomNumber();
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            answer = Engine.getTextAnswer();
            if (randomNum % 2 == 0 && answer.equals("yes") || randomNum % 2 != 0 && answer.equals("no")) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum % 2 == 0 && answer.equals("no")) {
                correctAnswer = "yes";
                Engine.callFaultMessage(answer, correctAnswer, username);
//                System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
//                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (randomNum % 2 != 0 && answer.equals("yes")) {
                correctAnswer = "no";
                Engine.callFaultMessage(answer, correctAnswer, username);
//                System.out.printf("'%s' is a wrong answer ;(. Correct answer was 'no'.\n", answer);
//                System.out.println("Let's try again, " + username + "!");
                break;
            } else {
                System.out.println("Incorrect input. You should answer only 'yes' or 'no'.");
                System.out.println("Let's try again, " + username + "!");
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
}
