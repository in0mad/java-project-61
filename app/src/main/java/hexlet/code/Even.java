package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void startTheGame() {
        String username = Greet.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int rightAnswers = 0;
        int randomNum;
        String answer;
        for (int i = 0; i < 3; i++) {
            randomNum = getRandomNumber();
            System.out.println("Question " + randomNum);
            System.out.print("Your answer: ");
            answer = getAnswer();
            if (randomNum % 2 == 0 && answer.equals("yes")) {
                rightAnswers++;
                System.out.println("Correct!");
            }
            else if (randomNum % 2 != 0 && answer.equals("no")) {
                rightAnswers++;
                System.out.println("Correct!");
            }
            else if (randomNum % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + username);
                break;
            }
            else if (randomNum % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + username);
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!", username);
        }
    }
    private static int getRandomNumber() {
        Random randNum = new Random();
        return randNum.nextInt(0, 100);
    }

    private static String getAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        scanner.close();
        return answer;
    }
}
