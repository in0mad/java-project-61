package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

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
        // генерация вводных для последовательности
        int seqStart = Utils.getRandomNumber();
        int seqLength = Utils.getRandomNumber(SEQ_LENGTH_START, SEQ_LENGTH_FINISH);
        int stepStart = 2;
        final int stepFinish = 6;
        int seqStep = Utils.getRandomNumber(stepStart, stepFinish);
        int[] sequence = getSequence(seqStart, seqLength, seqStep); // построение последовательности
        // определение позиции рандомного числа в последовательности
        int randNumPos = Utils.getRandomNumber(2, sequence.length + 1);
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
}
