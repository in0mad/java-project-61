package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    public static void startTheGame() {
        String ruleOfTheGame = "What number is missing in the progression?";
        // построение вопросов
        // вопрос - ответ для каждого раунда
        String[][] questionsAnswers = new String[Engine.ROUND_NUMBERS][2];
        for (int i = 0; i < questionsAnswers.length; i++) {
            questionsAnswers[i] = generateRoundData();
        }
        Engine.launchTheGame(ruleOfTheGame, questionsAnswers);
    }
    public static String[] generateRoundData() {
        int missedNum = 0;
        StringBuilder textSequence;
        int[] sequence = getRandomSequence();
        textSequence = new StringBuilder();
        // определение позиции рандомного числа в последовательности
        int randNumPos = Utils.getRandomNumber(2, sequence.length + 1);
        // построение последовательности
        for (int f = 0; f < sequence.length; f++) {
            if (f == randNumPos - 1) {
                textSequence.append(" " + "..");
            } else {
                textSequence.append(" ").append(sequence[f]);
            }
            missedNum = sequence[randNumPos - 1];
        }
        String question = textSequence.toString().trim();  // question
        String answer = String.valueOf(missedNum);  // answer
        return new String[]{question, answer};
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
}
