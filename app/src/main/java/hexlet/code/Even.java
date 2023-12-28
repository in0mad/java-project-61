package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void startTheGame() {
        String username = Greet.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int rightAnswers = 0;
        String answer;
        for (int i = 0; i < 3; i++) {
            int randomNum = getRandomNumber();
            System.out.println("Question " + randomNum);
            System.out.print("Your answer: ");
            answer = getAnswer();
            if (randomNum % 2 == 0 && answer.equals("yes")) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum % 2 != 0 && answer.equals("no")) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum % 2 == 0 && answer.equals("no")) {
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was 'yes'.\n", answer);
                System.out.println("Let's try again, " + username);
                break;
            } else if (randomNum % 2 != 0 && answer.equals("yes")) {
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was 'no'.\n", answer);
                System.out.println("Let's try again, " + username);
                break;
            } else {
                System.out.println("Incorrect input. You should answer only 'yes' or 'no'.");
                System.out.println("Let's try again, " + username);
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
    private static int getRandomNumber() {
        Random randNum = new Random();
        return randNum.nextInt(0, 100);
    }

    private static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }
}
