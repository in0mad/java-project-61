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
        String[] sequence = getSequence(seqStart, seqLength, seqStep); // построение последовательности
        // определение позиции рандомного числа в последовательности
        int randNumIndex = Utils.getRandomNumber(2, sequence.length + 1);
        int missedNum = Integer.parseInt(sequence[randNumIndex]); // пропущенное число
        // построение последовательности
        sequence[randNumIndex] = "..";
//        StringBuilder textSequence;
//        textSequence = new StringBuilder();
//        for (int f = 0; f < sequence.length; f++) {
//            if (f == randNumIndex - 1) {
//                textSequence.append(" " + "..");
//            } else {
//                textSequence.append(" ").append(sequence[f]);
//            }
//        }
//        String question = textSequence.toString().trim();  // question
        String question = String.join(" ", sequence);
        String answer = String.valueOf(missedNum);  // answer
        return new String[]{question, answer};
    }
    public static String[] getSequence(int start, int length, int step) {
        //int[] sequenceArr = new int[length];
        String[] sequenceArr = new String[length];
        // построение последовательности
        for (int f = 0, j = start; f < sequenceArr.length; f++, j += step) {
            //sequenceArr[f] = j;
            sequenceArr[f] = String.format("%d", j);
        }
        return sequenceArr;
    }
}
