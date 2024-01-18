package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    private static final int SEQ_LENGTH_START = 10;
    private static final int SEQ_LENGTH_FINISH = 16;
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
        // получение последовательности
        int[] sequenceRules = generateSequenceData();
        int start = sequenceRules[0];
        int length = sequenceRules[1];
        int step = sequenceRules[2];
        int[] sequence = getSequence(start, length, step);
        // определение позиции рандомного числа в последовательности
        int randNumPos = Utils.getRandomRangeNumber(2, sequence.length + 1);
        int missedNum = sequence[randNumPos - 1]; // пропущенное число
        // построение последовательности
        StringBuilder textSequence;
        textSequence = new StringBuilder();
        for (int f = 0; f < sequence.length; f++) {
            if (f == randNumPos - 1) {
                textSequence.append(" " + "..");
            } else {
                textSequence.append(" ").append(sequence[f]);
            }
        }
        String question = textSequence.toString().trim();  // question
        String answer = String.valueOf(missedNum);  // answer
        return new String[]{question, answer};
    }
    public static int[] getSequence(int start, int length, int step) {
        int[] sequenceArr = new int[length];
        // построение последовательности
        for (int f = 0, j = start; f < sequenceArr.length; f++, j += step) {
            sequenceArr[f] = j;
        }
        return sequenceArr;
    }
    public static int[] generateSequenceData() {
        // установка рандомной длины прогрессии
        Random rand = new Random();
        int sequenceLength = rand.nextInt(SEQ_LENGTH_START, SEQ_LENGTH_FINISH);
        // определение шага последовательности и стартового числа
        int stepStart = 2;
        final int stepFinish = 6;
        int randStep = rand.nextInt(stepStart, stepFinish);
        // определение стартового числа
        int startNum = Utils.getRandomNumber();
        return new int[] {startNum, sequenceLength, randStep};
    }
}
