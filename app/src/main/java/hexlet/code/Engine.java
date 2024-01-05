package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static final int ROUND_COUNTER = 3;
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

    public static int[] getRandomSequence() {
        // установка рандомной длины прогрессии
        Random rand = new Random();
        final int defaultSeqLengthStart = 10;
        final int defaultSeqLengthFinish = 16;
        int sequenceLength = rand.nextInt(defaultSeqLengthStart, defaultSeqLengthFinish);
        int[] sequenceArr = new int[sequenceLength];
        // определение шага последовательности и стартового числа
        final int defaultRandStepStart = 2;
        final int defaultRandStepFinish = 6;
        int randStep = rand.nextInt(defaultRandStepStart, defaultRandStepFinish);
        final int defaultStartNum = 3;
        final int defaultFinishNum = 88;
        int startNum = rand.nextInt(defaultStartNum, defaultFinishNum);
        // построение последовательности
        for (int f = 0, j = startNum; f < sequenceArr.length; f++, j = j + randStep) {
            sequenceArr[f] = j;
        }
        return sequenceArr;
    }
    public static char getRandomOperator() {
        // определение рандомного оператора
        Random rand = new Random();
        final int defaultOperatorStart = 1;
        final int defaultOperatorFinish = 4;
        int operatorRandomizer = rand.nextInt(defaultOperatorStart, defaultOperatorFinish);
        char operator = ' ';
        final int minus = 1;
        final int plus = 2;
        final int multiply = 3;
        // алгоритм рандомного оператора
        switch (operatorRandomizer) {
            case minus:
                operator = '-';
                break;
            case plus:
                operator = '+';
                break;
            case multiply:
                operator = '*';
                break;
            default:
                break;
        }
        return operator;
    }
    public static void callFaultMessage(int answer, int correctAnswer, String username) {
        System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
    public static void callFaultMessage(String answer, String correctAnswer, String username) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
}
