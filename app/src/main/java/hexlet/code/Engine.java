package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static int defineRoundCount() {
        return 3;
    }
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
        int defaultStartNum = 0;
        int defaultEndNum = 100;
        return randNum.nextInt(defaultStartNum, defaultEndNum);
    }
    public static int getRandomNumber(int start, int end) {
        Random randNum = new Random();
        return randNum.nextInt(start, end);
    }

    public static int getRandomNumber(int start) {
        Random randNum = new Random();
        int end = 100;
        return randNum.nextInt(start, end);
    }

    public static int[] getRandomSequence() {
        // установка рандомной длины прогрессии
        Random rand = new Random();
        int defaultSequenceLengthStart = 10;
        int defaultSequenceLengthEnd = 16;
        int sequenceLength = rand.nextInt(defaultSequenceLengthStart, defaultSequenceLengthEnd);
        int[] sequenceArr = new int[sequenceLength];
        // определение шага последовательности и стартового числа
        int randStepStart = 2;
        int randStepFinish = 6;
        int randStep = rand.nextInt(randStepStart, randStepFinish);
        int defaultStartNum = 3;
        int defaultFinishNum = 88;
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
        int randNumOperatorStart = 1;
        int randNumOperatorFinish = 4;
        int operatorRandomizer = rand.nextInt(randNumOperatorStart, randNumOperatorFinish);
        char operator = ' ';
        // алгоритм рандомного оператора
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
    public static void callFaultMessage(int answer, int correctAnswer, String username) {
        System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
    public static void callFaultMessage(String answer, String correctAnswer, String username) {
        System.out.printf("'%s' is a wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.println("Let's try again, " + username + "!");
    }
}
