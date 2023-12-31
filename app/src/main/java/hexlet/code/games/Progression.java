package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void startTheGame() {
        String ruleOfTheGame = "What number is missing in the progression?";
        StringBuilder textSequence;
        // построение вопросов
        // вопрос - ответ для каждого раунда
        int missedNum = 0;
        String[][] questions = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0, j = 0; i < questions.length; i++) {
            int[] sequence = getRandomSequence();
            textSequence = new StringBuilder();
            // определение позиции рандомного числа в последовательности
            int randNumPos = getRandomNumber(2, sequence.length + 1);
            // построение последовательности
            for (int f = 0; f < sequence.length; f++) {
                if (f == randNumPos - 1) {
                    textSequence.append(" " + "..");
                } else {
                    textSequence.append(" ").append(sequence[f]);
                }
                missedNum = sequence[randNumPos - 1];
            }
            String trimSequence = textSequence.toString().trim();
            questions[i][j] = trimSequence;  // question
            questions[i][j + 1] = String.valueOf(missedNum);  // answer
        }
        Engine.launchTheGame(ruleOfTheGame, questions);
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
    public static int getRandomNumber(int start, int end) {
        Random randNum = new Random();
        return randNum.nextInt(start, end);
    }
}
