package hexlet.code;

public class Calc {
    public static void startTheGame() {
        String username = Interaction.getName();
        System.out.println("What is the result of the expression?.");
        int rightAnswers = 0;
        int answer;
        for (int i = 0; i < 3; i++) {
            // рандомные операнды
            int randomNum1 = Rand.getRandomNumber();
            int randomNum2 = Rand.getRandomNumber();
            // переменная результата операций
            char operator = Rand.getRandomOperator();
            int arithmeticResult = makeArithmeticResult(operator, randomNum1, randomNum2);
            // основная логика игры
            System.out.printf("Question: %d %c %d\n", randomNum1, operator, randomNum2);
            System.out.print("Your answer: ");
            answer = Interaction.getIntAnswer();
            if (operator == '-' && randomNum1 - randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (operator == '+' && randomNum1 + randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (operator == '*' && randomNum1 * randomNum2 == answer) {
                rightAnswers++;
                System.out.println("Correct!");
            } else if (operator == '-' && randomNum1 - randomNum2 != answer) {
                System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, arithmeticResult);
                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (operator == '+' && randomNum1 + randomNum2 != answer) {
                System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, arithmeticResult);
                System.out.println("Let's try again, " + username + "!");
                break;
            } else if (operator == '*' && randomNum1 * randomNum2 != answer) {
                System.out.printf("'%d' is a wrong answer ;(. Correct answer was '%d'.\n", answer, arithmeticResult);
                System.out.println("Let's try again, " + username + "!");
                break;
            }
        }
        if (rightAnswers == 3) {
            System.out.printf("Congratulations, %s!\n", username);
        }
    }
    public static int makeArithmeticResult(char operator, int num1, int num2) {
        int arifmeticResult = 0;
        switch (operator) {
            case '-':
                arifmeticResult = num1 - num2;
                break;
            case '+':
                arifmeticResult = num1 + num2;
                break;
            case '*':
                arifmeticResult = num1 * num2;
                break;
            default:
                break;
        }
        return arifmeticResult;
    }
}
