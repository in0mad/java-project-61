package hexlet.code;

public class Even {
    public static void startTheGame() {
        String username = Interaction.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int rightAnswers = 0;
        String answer;
        for (int i = 0; i < 3; i++) {
            int randomNum = Rand.getRandomNumber();
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            answer = Interaction.getTextAnswer();
            if (randomNum % 2 == 0 && answer.equals("yes")) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum % 2 != 0 && answer.equals("no")) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (randomNum % 2 == 0 && answer.equals("no")) {
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was 'yes'.\n", answer);
                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (randomNum % 2 != 0 && answer.equals("yes")) {
                System.out.printf("'%s' is a wrong answer ;(. Correct answer was 'no'.\n", answer);
                System.out.println("Let's try again, " + username + "!");
                break;
            } else {
                System.out.println("Incorrect input. You should answer only 'yes' or 'no'.");
                System.out.println("Let's try again, " + username + "!");
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
}
