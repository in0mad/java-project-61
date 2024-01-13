package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_NUMBERS = 3;
//    public static String getName() {
//        System.out.println("Welcome to the Brain Games!");
//        System.out.print("May I have your name? ");
//        Scanner scanner = new Scanner(System.in);
//        String userName = scanner.next();
//        System.out.printf("Hello, %s!\n", userName);
//        return userName;
//    }
    public static void callFaultMessage(String answer, String correctAnswer, String username) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
    public static void launchTheGame(String gameRule, String[][] questionAnswer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.next();
        System.out.printf("Hello, %s!\n", username);
        int rightAnswersCount = 0;
//        String username = getName();
        System.out.println(gameRule);
        for (String[] i : questionAnswer) {
            System.out.printf("Question: %s\n", i[0]);
            System.out.print("Your answer: ");
            String answer = scanner.next();;
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
