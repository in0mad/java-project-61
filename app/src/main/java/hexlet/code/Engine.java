package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
//    public static final int ROUND_COUNTER = 3;
    public static String getTextAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
        return userName;
    }
    public static int getRandomNumber() {
        Random randNum = new Random();
        final int defaultStartNum = 0;
        final int defaultEndNum = 100;
        return randNum.nextInt(defaultStartNum, defaultEndNum);
    }
    public static int getRandomNumber(int start, int end) {
        Random randNum = new Random();
        return randNum.nextInt(start, end);
    }
    public static int getRandomNumber(int start) {
        Random randNum = new Random();
        final int defaultEnd = 100;
        return randNum.nextInt(start, defaultEnd);
    }
    public static void callFaultMessage(String answer, String correctAnswer, String username) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
    public static void launchTheGame(String gameRule, String[][] questionAnswer) {
        int rightAnswersCount = 0;
        String username = getName();
        System.out.println(gameRule);
        for (String[] i : questionAnswer) {
            System.out.printf("Question: %s\n", i[0]);
            System.out.print("Your answer: ");
            String answer = getTextAnswer();
            if (i[1].equals(answer)) {
                System.out.println("Correct!");
                rightAnswersCount++;
            } else {
                callFaultMessage(answer, i[1], username);
                break;
            }
        }
        if (rightAnswersCount == questionAnswer.length) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
}
