package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static String getTextAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static int getIntAnswer() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static void sayHello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
        scanner.close();
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
        java.util.Random randNum = new java.util.Random();
        return randNum.nextInt(0, 100);
    }
    public static char getRandomOperator() {
        // определение рандомного оператора
        Random rand = new Random();
        int operatorRandomizer = rand.nextInt(1, 4);
        char operator = ' ';
        // алгоритм рандомного оператора и подсчет результата
        switch (operatorRandomizer) {
            case 1:
                operator = '-';
                break;
            case 2:
                operator = '+';
                break;
            case 3:
                operator = '*';
                break;
            default:
                break;
        }
        return operator;
    }
    public static void callFaultMessage (int answer, int correctAnswer, String username) {
        System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
    public static void callFaultMessage (String answer, String correctAnswer, String username) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
}
