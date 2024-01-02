package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startTheGame() {
        String username = Engine.getName();
        System.out.println("What number is missing in the progression?");
        int rightAnswers = 0;
        int answer;
        int[] sequence = Engine.getRandomSequence();
        String textSequence = "";
        int missedNum = 0;
        // основная логика игры
        for (int i = 0; i < 3; i++) {
            // определение позиции рандомного числа в последовательности
            int randNumPos = Engine.getRandomNumber(2, sequence.length);
            for (int f = 0; f < sequence.length; f++) {
                if (f == randNumPos - 1) {
                    textSequence += " " + "..";
                } else {
                    textSequence += " " + sequence[f];
                }
                missedNum = randNumPos - 1;
            }
            // взаимодействие с юзером
            System.out.printf("Question: %s\n", textSequence);
            System.out.print("Your answer: ");
            answer = Engine.getIntAnswer();
            if (answer == missedNum) {
                rightAnswers++;
                System.out.println("Correct!");
            } else {
                Engine.callFaultMessage(answer, missedNum, username);
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
}
